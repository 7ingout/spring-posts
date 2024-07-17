package kr.re.kitri.springposts.controller;

import kr.re.kitri.springposts.model.Post;
import kr.re.kitri.springposts.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> allPosts() {
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