package org.demo_st.springboot.Interceptors;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR}) //on what method we need to apply
@Retention(RetentionPolicy.RUNTIME) // valid until runtime (we have 3 types on retentionas)
public @interface CustomAnnotationinter {
    String name() default "";
}
