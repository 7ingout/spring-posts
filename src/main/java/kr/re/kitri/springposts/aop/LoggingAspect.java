package kr.re.kitri.springposts.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* kr.re.kitri.springposts.controller.PostController.*(..))")
    public void loggingController(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String clsName = joinPoint.getSignature().getDeclaringTypeName();
        log.info(clsName + "." + methodName + " 서비스 수행 시작 합니다.");
    }

    @Before("execution(* kr.re.kitri.springposts.service.*Impl.*(..))")
    public void loggingService(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String clsName = joinPoint.getSignature().getDeclaringTypeName();
        log.info(clsName + "." + methodName + " 서비스 메소드 수행 시작 합니다.");
    }
}