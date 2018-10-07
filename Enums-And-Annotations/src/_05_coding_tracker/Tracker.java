package _05_coding_tracker;

import java.lang.reflect.Method;

public class Tracker {

  @Author(name = "Yavor")
  static void printMethodsByAuthor(Class<?> cl) {
    Method[] methods = cl.getDeclaredMethods();

    for (Method method : methods) {
      Author author = method.getDeclaredAnnotation(Author.class);
      System.out.println(String.format("%s: %s", author.name(), method.getName()));
    }
  }

  @Author(name = "Ivan")
  public void add() {
  }
}
