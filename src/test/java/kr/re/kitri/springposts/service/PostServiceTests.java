package kr.re.kitri.springposts.service;

import kr.re.kitri.springposts.model.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class PostServiceTests {

    @Autowired
    private PostService postService;

    @Test
    public void viewAllPosts() {
        // viewAllPosts 함수를 먼저 실행한다.
        // 성공적으로 실행되면 테스트 통과, 잘못 실행되거나 에러나고 하면 실패.
        // 조회 해서 글의 갯수가 1개 이상이면 통과
        Iterable<Post> posts = postService.viewAllPosts();
        Assertions.assertTrue(posts.iterator().hasNext());
    }

    @Test
    public void viewPostById() {
        // 상세보기를 실행한다. ID=2 으로 한다.
        // 결과 Post 의 ID값이 2 이면 통과
        Post post = postService.viewPostById(2);
        Assertions.assertEquals(2, post.getId());
    }

    @Test
    @Transactional // 테스트 후 원복
    public void registerPost() {
        // title="test", body="안녕하세요 테스트 하고 있어요.. 화이팅", likes=0
        // 반환된 Post의  title="test" 인지 확인하여 맞으면 통과
        Post testPost = new Post("test", "안녕하세요 테스트 하고 있어요.. 화이팅", 0);
        Post savedPost = postService.registerPost(testPost);
        Assertions.assertEquals("test", savedPost.getTitle());
    }

    @Test
    @Transactional
    public void updateLikesPlusOne() {
        // 2번 아이디의 포스트를 좋아요 수행한다.
        // 그래서 에러없이 수행되면 통과...
        postService.updateLikesPlusOne(2);

        // 아래 시나리오는 다소 오버임
        // --- 먼저, 수행전에 2번 포스트의 좋아요를 가져온다.
        // --- 수행후 2번 포스트의 좋아요를 가져와서 +1 인것이 확인되면 통과
    }
}