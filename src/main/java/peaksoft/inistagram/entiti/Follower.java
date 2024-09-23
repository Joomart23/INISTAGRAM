package peaksoft.inistagram.entiti;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.mapping.List;
import org.yaml.snakeyaml.events.Event;
import org.yaml.snakeyaml.tokens.Token;

import java.util.ArrayList;
@Entity
@Table(name = "followers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Follower {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "follower_name")
    @SequenceGenerator(name = "follower_name", sequenceName = "follower_seq", allocationSize = 1)
    private Long id;
    private Long subscribers;
    private Long subscriptions;
    @OneToOne
    private User user;


}
