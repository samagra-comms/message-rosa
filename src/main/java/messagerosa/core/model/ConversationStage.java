package messagerosa.core.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ConversationStage {
    public enum State {
        STARTING,
        ONGOING,
        COMPLETED
    }
    int stage;
    State state;

}
