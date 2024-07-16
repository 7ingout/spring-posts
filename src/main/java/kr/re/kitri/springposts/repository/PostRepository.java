package kr.re.kitri.springposts.repository;

import org.springframework.stereotype.Repository;

@Repository
public class PostRepository {

    // post 테이블에서 SQL 문으로 데이터를 가져온다.
    // select * from post;
    public String selectAllPost() {

        return "DB에서 가져온 글 데이터";
    }
}
