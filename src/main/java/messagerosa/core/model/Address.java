package messagerosa.core.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {

    private String city;
    private String country;
    private int countryCode;
}
