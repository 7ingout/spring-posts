package kr.re.kitri.springposts.service;

import kr.re.kitri.springposts.model.Post;

import java.util.List;

public interface PostService {

    // 전체글 보기
    List<Post> viewAllPosts();
    // 글 상세보기 by ID
    Post viewPostById(long postId);
    // 글 등록
    void registerPost(Post post);
    // 글 수정

    // 글 삭제

    // 좋아요..
    void updateLikesPlusOne(long postId);

}