package peaksoft.inistagram.dto.follower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FollowerRequest {
    private Long subscribers;
    private Long subscriptions;
}
