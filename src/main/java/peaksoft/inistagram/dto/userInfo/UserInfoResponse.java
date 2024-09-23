package peaksoft.inistagram.dto.userInfo;

import lombok.*;
import peaksoft.inistagram.gonger.Role;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfoResponse {
    private String fullName;
    private String biography;
    private Role role;
    private String image;
}
