package peaksoft.inistagram.entiti;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "comments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_name")
    @SequenceGenerator(name = "comment_name", sequenceName = "comment_seq", allocationSize = 1)
    private Long id;
    private String comment;
    private String createdAt;
    @ManyToOne
    private Post post;
    @OneToMany(mappedBy = "comment", cascade = CascadeType.ALL)
    private List<Like> likes;
    @ManyToOne
    private User user;


}
