package messagerosa.core.model;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class XMessagePayload {
	private String text;
	private MessageMedia media;
	private LocationParams location;
	private ContactCard contactCard;
	private ArrayList<ButtonChoice> buttonChoices;
	private StylingTag stylingTag;
	private String flow;
	private Integer questionIndex;
	private String mediaCaption;
	private String title;
	private ArrayList<Data> data;
}
