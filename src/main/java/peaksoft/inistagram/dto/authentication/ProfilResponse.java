package peaksoft.inistagram.dto.authentication;

import lombok.*;
import peaksoft.inistagram.gonger.Role;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfilResponse {
    private String filName;
    private String lastName;
    private String email;
    private Role role;
}
