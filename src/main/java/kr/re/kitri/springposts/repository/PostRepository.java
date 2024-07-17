package kr.re.kitri.springposts.repository;

import kr.re.kitri.springposts.model.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Mapper
public interface PostRepository {

    List<Post> selectAllPost();
    Post selectPostById(long postId);
    void insertPost(Post post);
    void updateLikesPlusOne(long postId);
}