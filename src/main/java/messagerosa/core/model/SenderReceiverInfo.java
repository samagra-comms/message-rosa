package messagerosa.core.model;

import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SenderReceiverInfo {

	// persist
	private String userID; //PhoneNo
	private ArrayList<String> groups;
	private String campaignID;
	private String formID;
	private boolean bot;
	private boolean broadcast;
	private Map<String, String> meta;
	private DeviceType deviceType;
	private String deviceID; //UUID
	private String encryptedDeviceID; //Encrypted Device String
}
