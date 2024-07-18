package kr.re.kitri.springposts.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="post_hj")
public class Post {
    @Id
    private long id;
    private String title;
    private String body;
    private int likes;
}
