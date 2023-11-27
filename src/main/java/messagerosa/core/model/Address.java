package messagerosa.core.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address implements Serializable {

    private String city;
    private String country;
    private int countryCode;
}
