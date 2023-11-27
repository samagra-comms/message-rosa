package messagerosa.core.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ContactCard implements Serializable {
    private Address address;
    private String name;
}
