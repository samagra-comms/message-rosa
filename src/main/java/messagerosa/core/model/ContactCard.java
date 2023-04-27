package messagerosa.core.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ContactCard{
    private Address address;
    private String name;
}
