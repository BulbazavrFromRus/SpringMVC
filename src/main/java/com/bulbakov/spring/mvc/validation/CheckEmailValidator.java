package com.bulbakov.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//для того чтобы указать, что этот класс валидатор мы имплементируем
//класс ConstraintValidator. Этот класс содержит дженерики.
//первый параметр это сама валидация и второй параметр это тип данных
//к которому мы будем применять аннотацию, так как email - String =>
//мы и пишем String
public class CheckEmailValidator
        implements ConstraintValidator<CheckEmail, String> {
    //variable for end of email with @ symbol
     private String endOfEmail;


    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmail  = checkEmail.value();
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(endOfEmail);
    }
}
