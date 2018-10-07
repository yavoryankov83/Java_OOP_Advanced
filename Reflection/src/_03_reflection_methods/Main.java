package _03_reflection_methods;

import java.lang.reflect.Method;

public class Main {
  public static void main(String[] args) throws NoSuchMethodException {

    Method zipMethod = Reflection.class.getDeclaredMethod("getZip");

    Class<?> returnType = zipMethod.getReturnType();
    System.out.println(returnType);
  }
}
