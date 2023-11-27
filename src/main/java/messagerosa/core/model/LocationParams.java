package messagerosa.core.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LocationParams implements Serializable {
    private double longitude;
    private double latitude;
    private String address;
    private String url;
    private String name;
}
