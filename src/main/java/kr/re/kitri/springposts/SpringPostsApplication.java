package kr.re.kitri.springposts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SpringPostsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPostsApplication.class, args);
    }

}