package peaksoft.inistagram.service.ServiceImpl;

import jakarta.persistence.EntityExistsException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import peaksoft.inistagram.dto.authentication.AuthenticationResponse;
import peaksoft.inistagram.dto.authentication.ProfilResponse;
import peaksoft.inistagram.dto.authentication.SingUPRequest;
import peaksoft.inistagram.dto.user.UserResponse;
import peaksoft.inistagram.entiti.User;
import peaksoft.inistagram.repository.UserRepository;
import peaksoft.inistagram.service.AuthenticationService;
import peaksoft.inistagram.service.jwt.JwtService;

import java.util.NoSuchElementException;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final UserRepository userRepository;
    @Override public AuthenticationResponse singUP(SingUPRequest sing) {
        if (repository.existsByEmail(sing.getEmail())) {
            throw new EntityExistsException(String.format(
                    "user табылган  %s жок "
                    , sing.getEmail()));
        }
   User user =      User.builder()
                .email(sing.getEmail())
                .password(passwordEncoder.encode(sing.getPassword()))
                .phoneNumber(sing.getPhoneNumber())
                .userName(sing.getUserName())
                .email(sing.getEmail())
                .build();
        userRepository.save(user);
       String token =   jwtService.getSecretKey(user);
    return    AuthenticationResponse.builder()
               .token(token)
               .email(sing.getEmail())
               .phoneNumber(sing.getPhoneNumber())
               .password(user.getPassword())
               .userName(sing.getUserName())
               .build();
    }

    @Override
    public AuthenticationResponse singIn(SingUPRequest sing) {
        User user =    repository.findByEmail(sing.getEmail()).orElseThrow(() ->
                new NoSuchElementException("menu табылган  %s жок, ID: " + sing.getEmail()));
        if (repository.existsByEmail(sing.getEmail())){
            throw new EntityExistsException("not email");
        }
        if (!passwordEncoder.matches(sing.getPassword(), user.getPassword())){
            throw new EntityExistsException( "not password");
        }
        String token = jwtService.getSecretKey(user);

        return AuthenticationResponse.builder()
                .token(token)
                .role(user.getRole())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }

    @Override
    public ProfilResponse getPro() {
        SecurityContext securityContext =  SecurityContextHolder.getContext();
        Authentication authentication = securityContext.getAuthentication();
        String email = authentication.getName();
        User user = userRepository.findByEmail(email).orElseThrow(() -> new NoSuchElementException("user not found"));

        return ProfilResponse.builder()
                .email(user.getEmail())
                .role(user.getRole())
                .lastName(user.getUsername())
                .build();
    }
}

