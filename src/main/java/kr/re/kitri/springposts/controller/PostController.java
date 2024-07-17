package kr.re.kitri.springposts.controller;

import kr.re.kitri.springposts.model.Post;
import kr.re.kitri.springposts.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PostController {

    private static final Logger log = LoggerFactory.getLogger(PostController.class);

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> allPosts() {
//        System.out.println(); 이거 쓰지말래요
        log.info("테스트합니다. 로깅 좋아요 ..");
        return postService.viewAllPosts();
    }

    // localhost:8080/posts/2
    @GetMapping("/posts/{postId}")
    public Post viewPostById(@PathVariable long postId) {
        return postService.viewPostById(postId);
    }

    @PostMapping("/posts")
    public void addPost(@RequestBody Post post) {
        postService.registerPost(post);
    }

    @PatchMapping("/posts/{postId}/likes")
    public void doLike(@PathVariable long postId) {
        postService.updateLikesPlusOne(postId);
    }

}