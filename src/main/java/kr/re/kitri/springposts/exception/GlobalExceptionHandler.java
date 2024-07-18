package kr.re.kitri.springposts.exception;

import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(BadSqlGrammarException.class)
    public String handleBSGE(BadSqlGrammarException exception) {
        return "고객님 불편을 드려 ㅈㅅㅈㅅ";
    }

}
