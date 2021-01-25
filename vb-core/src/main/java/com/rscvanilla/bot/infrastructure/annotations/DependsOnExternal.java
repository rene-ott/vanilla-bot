package com.rscvanilla.bot.infrastructure.annotations;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD, ElementType.METHOD})
@BindingAnnotation
public @interface DependsOnExternal {
    boolean mightKeep() default false;
    int times() default 0;
}
