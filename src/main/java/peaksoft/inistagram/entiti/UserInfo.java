package peaksoft.inistagram.entiti;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import peaksoft.inistagram.gonger.Role;
@Entity
@Table(name = "userInfos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userInfo_name")
    @SequenceGenerator(name = "userInfo_name", sequenceName = "userInfo_seq", allocationSize = 1)
    private Long id;
    private String fullName;
    private String biography;
    private Role role;
    private String image;
    @OneToOne
    private User user;
}
