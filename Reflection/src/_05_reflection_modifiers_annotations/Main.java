package _05_reflection_modifiers_annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
  public static void main(String[] args) throws NoSuchMethodException {

    Class<Reflection> reflectionClass = Reflection.class;

    //get modifiers
    Method method = reflectionClass.getDeclaredMethod("getName");

    int modifiers = method.getModifiers();

    System.out.println(Modifier.isPublic(modifiers));
    System.out.println(Modifier.isFinal(modifiers));
    System.out.println(Modifier.isStatic(modifiers));

    //get annotations
    Annotation[] annotations = reflectionClass.getDeclaredMethod("getEmail").getDeclaredAnnotations();
    for (Annotation annotation : annotations) {
      System.out.println(annotation.toString());
    }
  }
}
