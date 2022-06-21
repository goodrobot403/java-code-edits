package com.goodrobot.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Metadata {

    String EMPTY = "";

    String label() default EMPTY;

    String cmAttribute() default EMPTY;

    VisibleFor visibleFor();

}
