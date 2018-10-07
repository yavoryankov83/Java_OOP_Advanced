package _04_reflection_getters_setters;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    Method[] declaredMethods = Reflection.class.getDeclaredMethods();

    List<Method> getters;
    List<Method> setters;

    getters = returnGetters(Arrays.asList(declaredMethods));

    setters = returnSetters(Arrays.asList(declaredMethods));

    getters.sort((x, y) -> x.getName().compareTo(y.getName()));
    setters.sort((x, y) -> x.getName().compareTo(y.getName()));

    printGetters(getters);
    printSetters(setters);
  }

  private static List<Method> returnGetters(List<Method> methods) {
    List<Method> getters = new ArrayList<>();
    for (Method method : methods) {
      if (method.getName().startsWith("get") &&
              !method.getReturnType().equals(void.class) &&
              method.getParameterTypes().length == 0) {
        getters.add(method);
      }
    }
    return getters;
  }

  private static List<Method> returnSetters(List<Method> methods) {
    List<Method> setters = new ArrayList<>();
    for (Method method : methods) {
      if (method.getName().startsWith("set") &&
              method.getReturnType().equals(void.class) &&
              method.getParameterTypes().length > 0) {
        setters.add(method);
      }
    }
    return setters;
  }

  private static void printGetters(List<Method> methodList) {
    for (Method method : methodList) {
      System.out.println(String.format("%s will return %s", method.getName(), method.getReturnType().getSimpleName()));
    }
  }

  private static void printSetters(List<Method> methodList) {
    for (Method method : methodList) {
      System.out.println(String.format("%s and will set field of %s", method.getName(), method.getReturnType().getSimpleName()));
    }
  }

}
