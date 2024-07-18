package kr.re.kitri.springposts.controller;

import kr.re.kitri.springposts.model.Post;
import kr.re.kitri.springposts.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 게시물 컨트롤러 클래스
 * 게시물 관련 API를 처리합니다.
 */
@Slf4j
@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostService postService;

    /**
     * 모든 게시물을 조회합니다.
     *
     * @return 모든 게시물 목록
     */
    @GetMapping("/posts")
    public ResponseEntity<Iterable<Post>> allPosts() {
        return ResponseEntity.ok().body(postService.viewAllPosts());
    }

    /**
     * ID로 게시물을 조회합니다.
     *
     * @param postId 조회할 게시물의 ID
     * @return 조회된 게시물
     */
    @GetMapping("/posts/{postId}")
    public ResponseEntity<Post> viewPostById(@PathVariable long postId) {
        return ResponseEntity.ok().body(postService.viewPostById(postId));
    }

    /**
     * 새로운 게시물을 등록합니다.
     *
     * @param post 등록할 게시물의 정보
     * @return 등록된 게시물
     */
    @PostMapping("/posts")
    public ResponseEntity<Post> addPost(@RequestBody Post post) {
        return ResponseEntity.status(201).body(postService.registerPost(post));
    }

    /**
     * 게시물에 좋아요를 추가합니다.
     *
     * @param postId 좋아요를 추가할 게시물의 ID
     */
    @PatchMapping("/posts/{postId}/likes")
    public ResponseEntity<Void> doLike(@PathVariable long postId) {
        postService.updateLikesPlusOne(postId);
        return ResponseEntity.ok().build();
    }
}