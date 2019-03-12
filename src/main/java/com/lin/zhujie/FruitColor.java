package com.lin.zhujie;


import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FruitColor {

    //颜色枚举
    public enum Color{RED,GREEN,YELLOW};

    //颜色属性
    Color fruitColor() default Color.GREEN;
}
