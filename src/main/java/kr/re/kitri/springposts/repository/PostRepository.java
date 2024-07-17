package kr.re.kitri.springposts.repository;

import kr.re.kitri.springposts.model.Post;
//import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
//@Mapper
public interface PostRepository extends CrudRepository<Post, Long> {

/*    List<Post> selectAllPost();
    Post selectPostById(long postId);
    void insertPost(Post post);
    void updateLikesPlusOne(long postId);*/

    //전체보기
    @Override
    Iterable<Post> findAll();

    //상세보기
    @Override
    Optional<Post> findById(Long postId);

    // 글 등록하기
    @Override
    Post save(Post post);

    // 글 삭제
    @Override
    void deleteById(Long postId);
}