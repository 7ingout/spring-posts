package kr.re.kitri.springposts.service;

import kr.re.kitri.springposts.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    // 전체글 보기
    public String viewAllPosts() {
        return postRepository.selectAllPost();
    }

    // 글 상세보기 by ID

    // 글 등록

    // 글 수정

    // 글 삭제

    // 좋아요

}
