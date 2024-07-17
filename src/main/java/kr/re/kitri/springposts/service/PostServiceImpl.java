package kr.re.kitri.springposts.service;

import kr.re.kitri.springposts.model.Post;
import kr.re.kitri.springposts.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // 전체글 보기
    public List<Post> viewAllPosts() {
        return postRepository.selectAllPost();
    }
    // 글 상세보기 by ID
    public Post viewPostById(long postId) {
        return postRepository.selectPostById(postId);
    }

    // 글 등록
    public void registerPost(Post post) {
        postRepository.insertPost(post);
    }
    // 글 수정

    // 글 삭제

    // 좋아요..
    public void updateLikesPlusOne(long postId) {
        postRepository.updateLikesPlusOne(postId);
    }
}