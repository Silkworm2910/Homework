package lessons.lesson19.annotation;

//описание
//@Target() указывает на сферу ответсвенности аннотации
//METHOD
//CONSTRUCTOR
//FIELD

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PermissionRequired {
    User.Permission value();// могут возвращать String, примитивы, enum и аннотации

}
