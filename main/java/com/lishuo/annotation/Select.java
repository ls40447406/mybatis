package com.lishuo.annotation;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Service
public @interface Select {
    String value();
}
