package com.bulbakov.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//указывает на ту область которую мы будем использовать =>
//эту аннотацию мы будем использовать для полей
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
//класс CheckEmailValidator будет обрабатывать нашу аннотацию
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface  CheckEmail {
    //когда мы писали аннотацию над другими объектами
    //в этих аннотация были объекты value и message
    //когда мы созздаём собственную аннотацию мы прописываем эти
    //объекты в виде методов и пишем данные,которые должны быть там

    //это всё дефолтные значения и они будут
    //появляться только тогда когда мы ничего не будем указывать
    //в скобках в аннотации
    public String value() default "xyz.com";
    public String message() default "email must ends with xyz.com";

    public Class<?>[] groups() default {};
    public Class<? extends Payload> [] payload() default {};

}
