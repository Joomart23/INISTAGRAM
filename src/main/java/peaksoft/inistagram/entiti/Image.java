package peaksoft.inistagram.entiti;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "imeges")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "image_name")
    @SequenceGenerator(name = "image_name", sequenceName = "image_seq", allocationSize = 1)
    private Long id;
    private String image;
    @OneToOne
    private User user;
    @ManyToOne
    private Post post;

}
