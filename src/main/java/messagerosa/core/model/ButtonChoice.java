package messagerosa.core.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ButtonChoice {
    private String key;
    private String text;
    private Boolean backmenu;
}
