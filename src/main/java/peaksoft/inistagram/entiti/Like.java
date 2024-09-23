package peaksoft.inistagram.entiti;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "likes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "like_name")
    @SequenceGenerator(name = "like_name", sequenceName = "like_seq", allocationSize = 1)
    private Long id;
    private String isLike;
    @ManyToOne
    private Post post;
    @ManyToOne
    private Comment comment;
    @OneToOne
    private User user;






}
