package peaksoft.inistagram.service.ServiceImpl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import peaksoft.inistagram.dto.SimpleResponse;
import peaksoft.inistagram.dto.user.UserRequest;
import peaksoft.inistagram.entiti.User;
import peaksoft.inistagram.repository.UserRepository;
import peaksoft.inistagram.service.UserService;
@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public SimpleResponse saveUser(UserRequest userRequest) {
        User user = new User();
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setUserName(userRequest.getUserName());
        user.setPhoneNumber(userRequest.getPhoneNumber());
        userRepository.save(user);
        return new  SimpleResponse(
                HttpStatus.OK,
                "сакталды"
        );
    }
}
