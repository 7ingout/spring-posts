package kr.re.kitri.springposts.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    private long id;
    private String title;
    private String body;
    private int likes;
}
