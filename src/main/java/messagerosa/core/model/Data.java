package messagerosa.core.model;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Data implements Serializable {
    private String key;
    private String value;
}
