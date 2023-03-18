package messagerosa.core.model;

import java.io.Serializable;
import java.io.StringWriter;
import java.time.Instant;
import java.util.ArrayList;
import java.util.UUID;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlRootElement;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class XMessage implements Serializable {
	public enum MessageState {
		NOT_SENT,
		FAILED_TO_DELIVER,
		DELIVERED,
		READ,
		REPLIED,
		ENQUEUED,
		SENT,
		OPTED_IN,
		OPTED_OUT
	}

	public enum MessageType {
		HSM,
		TEXT,
		HSM_WITH_BUTTON,
		BROADCAST_TEXT
	}

	private UUID sessionId;

	private String ownerOrgId;

	private String ownerId;

	private UUID botId;

	//Persist
	private String app;

	private MessageType messageType;

	private String adapterId;

	//Persist
	private MessageId messageId;

	@NotNull
	private SenderReceiverInfo to;
	@NotNull
	private SenderReceiverInfo from;
	@NotNull

	//Persist
	private String channelURI; // whatsapp
	@NotNull

	//Persist
	private String providerURI; // gupshup

	//Persist
	@NotNull
	private Long timestamp;

	private String userState;
	private String encryptionProtocol;

	private MessageState messageState;

	private String lastMessageID;

	private ConversationStage conversationStage;
	
	private ArrayList<Integer> conversationLevel;
	
	@NotNull
	private ArrayList<Transformer> transformers; // -1 no transfer like ms3 transforms msg to next msg

	private XMessageThread thread;
	private XMessagePayload payload;

	private static JAXBContext context;
	private static Marshaller marshaller;

	static {
		try {
			context = JAXBContext.newInstance(XMessage.class);
			marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}


	public String toXML() throws JAXBException {
		StringWriter stringWriter = new StringWriter();
		marshaller.marshal(this, stringWriter);
		return stringWriter.toString();
	}

	public void completeTransform() {
		transformers.remove(0);
	}

	public String getChannel(){
		return channelURI;
	}

	public String getProvider(){
		return providerURI;
	}

	public long secondsSinceLastMessage(){
		if(this.timestamp != null){
			long messageTime = this.timestamp;
			long currentTimestamp = Instant.now().getEpochSecond();
			return currentTimestamp - messageTime;
		}else{
			return Long.MAX_VALUE;
		}
	}

	public void setChannel(String channel){
		this.channelURI = channel;
	}

	public void setProvider(String provider){
		this.providerURI = provider;
	}

	public void setNextDestination(String destination){
		System.out.println("SetNextDestination Called");
		if(destination.equals("Outbound")){
			this.transformers = new ArrayList<>();
		}else{
			Transformer transformer = new Transformer();
			transformer.setId(TransformerRegistry.getID(destination));
			ArrayList<Transformer> oldTransformers;
			if(this.getTransformers() == null){
				oldTransformers = new ArrayList<>();
			}else{
				oldTransformers = this.transformers;
			}
			oldTransformers.add(transformer);
			this.setTransformers(oldTransformers);
		}
	}

	public String getCampaign(){
		return this.getApp();
	}

	public String getMessageStateString(){
		return this.messageState.name();
	}
}
