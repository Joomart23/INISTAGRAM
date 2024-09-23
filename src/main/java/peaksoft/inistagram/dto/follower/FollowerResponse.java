package peaksoft.inistagram.dto.follower;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FollowerResponse {
    private Long subscribers;
    private Long subscriptions;
}
