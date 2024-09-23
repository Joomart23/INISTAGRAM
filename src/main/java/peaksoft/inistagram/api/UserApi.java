package peaksoft.inistagram.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.inistagram.dto.SimpleResponse;
import peaksoft.inistagram.dto.user.UserRequest;
import peaksoft.inistagram.service.UserService;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserApi {
    private final UserService userService;
    @GetMapping
    public SimpleResponse saveUser (UserRequest userRequest){
        return userService.saveUser(userRequest);
    }


}
