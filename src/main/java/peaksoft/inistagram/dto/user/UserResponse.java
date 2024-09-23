package peaksoft.inistagram.dto.user;

import lombok.*;
import peaksoft.inistagram.gonger.Role;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    private String userName;
    private String password;
    private String email;
    private String phoneNumber;

    private Role role;
}
