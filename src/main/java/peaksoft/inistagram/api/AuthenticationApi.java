package peaksoft.inistagram.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import peaksoft.inistagram.dto.authentication.AuthenticationResponse;
import peaksoft.inistagram.dto.authentication.SingUPRequest;
import peaksoft.inistagram.service.AuthenticationService;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationApi {
    private final AuthenticationService authenticationService;

    @PostMapping("/signUp")  // Түзөтүлдү: "singUp" -> "signUp"
    public AuthenticationResponse signUp(@RequestBody SingUPRequest singUpRequest) { // Түзөтүлдү: параметрдин аталышы
        return authenticationService.singUP(singUpRequest);
    }

    @PostMapping("/signIn")  // Түзөтүлдү: жаңы маршрут кошулду
    public AuthenticationResponse signIn(@RequestBody SingUPRequest signInRequest) { // Түзөтүлдү: параметрдин аталышы
        return authenticationService.singIn(signInRequest);
    }
}