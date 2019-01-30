package com.kdt.com.kdt.test1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by admin on 2019/1/13
 * AT 10:56
 **/
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
public @interface MyInnation {
    String value();
}
