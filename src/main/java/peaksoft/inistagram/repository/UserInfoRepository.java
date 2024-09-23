package peaksoft.inistagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.inistagram.entiti.UserInfo;

import java.beans.JavaBean;

public interface UserInfoRepository  extends JpaRepository<UserInfo, Long> {
}
