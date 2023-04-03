package messagerosa.core.model;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Data {
    private String key;
    private String value;
}
