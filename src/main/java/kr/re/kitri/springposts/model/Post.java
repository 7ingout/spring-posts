package kr.re.kitri.springposts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "post")
public class Post {
    @Id
    private long id;
    private String title;
    private String body;
    private int likes;

    public Post(String title, String body, int likes) {
        this.title = title;
        this.body = body;
        this.likes = likes;
    }
}