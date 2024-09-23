package peaksoft.inistagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.inistagram.entiti.Like;

import java.beans.JavaBean;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
