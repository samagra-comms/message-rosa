package messagerosa.core.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageId {
   private String Id;
   private String channelMessageId;
   private String replyId;
}
