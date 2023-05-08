package messagerosa.core.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LocationParams {
    private double longitude;
    private double latitude;
    private String address;
    private String url;
    private String name;
}
