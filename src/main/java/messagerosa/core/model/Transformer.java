package messagerosa.core.model;

import lombok.*;

import java.util.HashMap;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Transformer {
    private String id;
    private HashMap<String, String> metaData;
}
