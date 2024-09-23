package peaksoft.inistagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.inistagram.entiti.Follower;

public interface FollowerRepository  extends JpaRepository<Follower, Long> {
}
