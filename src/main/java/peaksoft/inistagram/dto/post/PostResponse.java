package peaksoft.inistagram.dto.post;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostResponse {
    private  String title;
    private String description;
    private String createdAt;
}
