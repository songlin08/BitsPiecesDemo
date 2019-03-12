package com.lin.zhujie;

import java.lang.reflect.Field;

public class FruitInfoUtil {

    public static void FruitInfoUtil(Class<?> clazz){
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = field.getAnnotation(FruitName.class);
                System.out.println(" 水果名称：" + fruitName.value());
            }
            else if (field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitName = field.getAnnotation(FruitColor.class);
                System.out.println(" 水果颜色：" + fruitName.fruitColor().toString());
            }
        }

    }
}
