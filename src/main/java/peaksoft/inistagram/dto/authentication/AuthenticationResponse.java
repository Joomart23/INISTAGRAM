package peaksoft.inistagram.dto.authentication;

import lombok.*;
import peaksoft.inistagram.gonger.Role;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class  AuthenticationResponse {
    private String token;
    private String userName;
    private String password;
    private String email;
    private String phoneNumber;
    private Role role;
}
