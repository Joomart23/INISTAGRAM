package peaksoft.inistagram.dto;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SimpleResponse {
    private HttpStatus status;
    private String message;
}
