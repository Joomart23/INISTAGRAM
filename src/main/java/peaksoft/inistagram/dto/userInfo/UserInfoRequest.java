package peaksoft.inistagram.dto.userInfo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.inistagram.gonger.Role;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoRequest {
    private String fullName;
    private String biography;
    private Role role;
    private String image;
}
