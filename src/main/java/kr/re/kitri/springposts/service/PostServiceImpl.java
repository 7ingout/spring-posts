package kr.re.kitri.springposts.service;

import kr.re.kitri.springposts.model.Post;
import kr.re.kitri.springposts.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    // 전체글 보기
    public Iterable<Post> viewAllPosts() {
        return postRepository.findAll();
    }
    // 글 상세보기 by ID
    public Post viewPostById(long postId) {
        Optional<Post> post = postRepository.findById(postId);
        return post.orElse(null);
    }

    // 글 등록
    public Post registerPost(Post post) {
        return postRepository.save(post);
    }
    // 글 수정

    // 글 삭제

    // 좋아요..
    public void updateLikesPlusOne(long postId) {
        postRepository.increaseLikes(postId);
    }
}