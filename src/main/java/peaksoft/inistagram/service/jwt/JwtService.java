package peaksoft.inistagram.service.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import peaksoft.inistagram.entiti.User;
import peaksoft.inistagram.repository.UserRepository;

import java.time.ZonedDateTime;
import java.util.NoSuchElementException;
@RequiredArgsConstructor
@Component
public class JwtService {
    @Value("${spring.jwt.secretKay}")
    private String secretKey;
    private final UserRepository userRepository;

    public String getSecretKey(User use) {
        Algorithm algorithm = Algorithm.HMAC512(secretKey);
        return JWT.create()
                .withClaim("email", use.getEmail())
                .withClaim("role", use.getRole().name())
                .withIssuedAt(ZonedDateTime.now().toInstant())
                .withExpiresAt((ZonedDateTime.now().plusHours(1).toInstant()))
                .sign(algorithm);

    }

    public String generateToken(String token) {
        Algorithm algorithm = Algorithm.HMAC512(secretKey);
        JWTVerifier build = JWT.require(algorithm).build();
        DecodedJWT verify = build.verify(token);
        return verify.getClaim("email").asString();

    }
    public User get() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication authentication = securityContext.getAuthentication();
        String email = authentication.getName();
        return userRepository.findByEmail(email).orElseThrow(() -> new NoSuchElementException("user not found"));
    }

}