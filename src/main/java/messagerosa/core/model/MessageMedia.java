package messagerosa.core.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MessageMedia implements Serializable {
    private MediaCategory category; //category list {image, audio, document, video}
    private String text; //caption, if applicable
    private String url;
    private MessageMediaError messageMediaError;
    private Double size;
}
