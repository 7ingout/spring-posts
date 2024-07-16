package kr.re.kitri.springposts.repository;

import kr.re.kitri.springposts.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository {

    // post 테이블에서 SQL 문으로 데이터를 가져온다.
    // select * from post;
    public List<Post> selectAllPost() {

        // DB에서 3개의 글을 가져와서 자바의 모델타입으로 변환하여
        List<Post> posts = new ArrayList<Post>();
        posts.add(new Post(1, "first post", "스프링 멋져요", 0));
        posts.add(new Post(2, "second post", "스프링 멋져요2", 4));
        posts.add(new Post(3, "third post", "스프링 멋져요3", 16));
        return posts;
    }

    public Post selectPostById(long postId) {
        return new Post(postId, "테스트 제목", "테스트 바디", 0);
    }
}
