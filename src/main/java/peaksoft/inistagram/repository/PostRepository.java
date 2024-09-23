package peaksoft.inistagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.inistagram.entiti.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
