package peaksoft.inistagram.dto.authentication;

import lombok.*;
import peaksoft.inistagram.gonger.Role;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SingUPRequest {
    private String userName;
    private String password;
    private String email;
    private String phoneNumber;
    private Role role;
}
