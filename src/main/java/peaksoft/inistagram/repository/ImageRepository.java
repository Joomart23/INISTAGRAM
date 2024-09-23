package peaksoft.inistagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.inistagram.entiti.Image;

public interface ImageRepository  extends JpaRepository<Image, Long> {
}
