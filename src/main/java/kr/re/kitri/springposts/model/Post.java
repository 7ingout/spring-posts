package kr.re.kitri.springposts.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private long id;
    private String title;
    private String body;
    private int likes;
}
