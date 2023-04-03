package messagerosa.core.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MessageMedia {
    private MediaCategory category; //category list {image, audio, document, video}
    private String text; //caption, if applicable
    private String url;
    private MessageMediaError messageMediaError;
    private Double size;
}
