package peaksoft.inistagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.inistagram.entiti.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
