package kr.re.kitri.springposts.controller;

import kr.re.kitri.springposts.model.Post;
import kr.re.kitri.springposts.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostService postService;

    @GetMapping("/posts")
    public ResponseEntity<Iterable<Post>> allPosts() {
//        System.out.println(); 이거 쓰지말래요
        log.debug("테스트합니다. 로깅 좋아요 ..");
        return ResponseEntity.ok().body(postService.viewAllPosts());
    }

    @GetMapping("/posts/{postId}")
    public ResponseEntity<Post> viewPostById(@PathVariable long postId) {
        log.debug("ID로 게시물을 조회합니다 " + postId);
        return ResponseEntity.ok().body(postService.viewPostById(postId));
    }

    @PostMapping("/posts")
    public ResponseEntity<Post> addPost(@RequestBody Post post) {
        log.debug("새로운 게시물을 등록합니데이" + post.getTitle());
        return ResponseEntity.status(201).body(postService.registerPost(post));
    }

    @PatchMapping("/posts/{postId}/likes")
    public ResponseEntity<Void> doLike(@PathVariable long postId) {
        log.debug("게시물 조아" + postId);
        postService.updateLikesPlusOne(postId);
        return ResponseEntity.ok().build();
    }

}