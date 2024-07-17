package kr.re.kitri.springposts.repository;

import kr.re.kitri.springposts.model.Post;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
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

    public Post insertPost(Post post) {
        // 실제 테이블에 인서트 ..
        // insert into post values (post.getid(), post.getTitle(), post.getBody(), .....);
        System.out.println("잘 인서트 됐습니다 . .");
        return post;
    }

    public Post updateLikesPlusOne(long postId) {
        // postId에 해당하는 글의 Likes의 수를 1 증가 ..
        // postId 글의 조회해서 그 글을 리턴한다
        return new Post(122, "asfds", "asdf", 1);
    }
}
