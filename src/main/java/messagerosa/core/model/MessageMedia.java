package messagerosa.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageMedia {
    private String category; //category list {image, audio, document, video}
    private String text; //caption, if applicable
    private String url;
}
