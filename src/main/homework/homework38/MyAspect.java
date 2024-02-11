package homework.homework38;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@Aspect
@Component
public class MyAspect {

    private Logger logger = LoggerFactory.getLogger(MyAspect.class);

    @Pointcut("execution(public * homework.homework38.MyService.*(..))")
    public void callAtMyServicePublic(){}

    @Before("callAtMyServicePublic()")
    public void beforeCallAtMethod1(JoinPoint joinPoint){
        String collect = Arrays.stream(joinPoint.getArgs())
                .map(Object::toString)
                .collect(Collectors.joining(","));
        logger.info("before {}, args=[{}]", joinPoint, collect);
    }

    @After("callAtMyServicePublic()")
    public void afterCallAt(JoinPoint joinPoint){
        logger.info("after:{} ", joinPoint);
    }


}
