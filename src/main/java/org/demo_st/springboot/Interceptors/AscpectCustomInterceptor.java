package org.demo_st.springboot.Interceptors;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AscpectCustomInterceptor {

    @Around("@annotation(org.demo_st.springboot.Interceptors.CustomAnnotationinter)")
    public void invoke(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before executing controller");
        proceedingJoinPoint.proceed();
        System.out.println("after executing controller");
    }
}
