package _02_reflection_fields;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
  public static void main(String[] args) throws NoSuchMethodException,
          IllegalAccessException,
          InvocationTargetException,
          InstantiationException,
          NoSuchFieldException {

//        Class<Audi> audi = Audi.class;
//
//        audi.getDeclaredFields();
//
//        Field[] declaredFields = audi.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField.getName());
//        }

    //set new value to current field
    Audi a8 = Audi.class
            .getConstructor(String.class)
            .newInstance("A8");

    Field currField = Audi.class.getDeclaredField("model");

    //change field value
    currField.setAccessible(true);

    Object value = currField.get(a8);
    System.out.println(value);

    //set field value
    currField.set(a8, "A12");
    Object value1 = currField.get(a8);
    System.out.println(value1);
    currField.setAccessible(false);
  }
}
