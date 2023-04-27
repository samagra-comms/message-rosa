package messagerosa.core.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class MessageId {
   private String Id;
   private String channelMessageId;
   private String replyId;
}
