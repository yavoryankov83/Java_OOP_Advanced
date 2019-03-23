import model.Coffee;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws NoSuchFieldException,
          ClassNotFoundException, NoSuchMethodException,
          IllegalAccessException,
          InvocationTargetException,
          InstantiationException {

    Coffee coffee = new Coffee(60, "small", 2);

    //get from the instance
    System.out.println(coffee
            .getClass()
            .getName());

    //get from the class
    System.out.println(Coffee
            .class
            .getName());

    System.out.println(coffee
            .getClass()
            .getSimpleName());
    System.out.println(Coffee
            .class
            .getSimpleName());

    System.out.println(coffee
            .getClass()
            .getTypeName());

    System.out.println(coffee
            .getClass()
            .getSuperclass()
            .getSimpleName());

    Arrays.stream(coffee
            .getClass()
            .getInterfaces())
            .forEach(i -> System.out.println(i.getSimpleName()));

    Arrays.stream(coffee
            .getClass()
            .getAnnotations())
            .forEach(System.out::println);

    System.out.println(coffee
            .getClass()
            .forName("model.Coffee"));

    Arrays.stream(Coffee
            .class
            .getDeclaredFields())
            .forEach(x -> System.out.println(x.getName()));

    Arrays.stream(Coffee
            .class
            .getDeclaredMethods())
            .forEach(x -> System.out.println(x.getName()));

    Arrays.stream(Coffee
            .class
            .getAnnotations())
            .forEach(System.out::println);

    try {
      System.out.println(Coffee
              .class
              .getDeclaredField("number"));
    } catch (NoSuchFieldException ex) {
      System.out.println("No field with this name");
    }

    //new instance
    Coffee coffee1 = coffee
            .getClass()
            .getDeclaredConstructor(int.class, String.class, int.class)
            .newInstance(5, "Big", 2);

    //get only public constructors
    Constructor<?>[] constructors = coffee.getClass().getConstructors();

    //get all constructors
    Constructor<?>[] declaredConstructors = coffee.getClass().getDeclaredConstructors();

    //get and set value to current field

    //get current field
    Field priceField = Coffee.class.getDeclaredField("price");

    //get access to the field
    priceField.setAccessible(true);

    //get field value from current class
    Object value = priceField.get(coffee1);

    System.out.println(priceField.get(coffee1));

    //set value to the field
    priceField.set(coffee1, 23);

    System.out.println(priceField.get(coffee1));

    //stop access to the field
    priceField.setAccessible(false);

    Arrays.stream(Coffee.class.getDeclaredMethods()).forEach(System.out::println);

    //get specific method
    Method getPrice = Coffee.class.getDeclaredMethod("getPrice");

    //get access to method
    getPrice.setAccessible(true);

    System.out.println(getPrice.getReturnType());

    //get modifier of current method
    int methodModifier = Coffee.class.getDeclaredMethod("getPrice").getModifiers();

    System.out.println(Modifier.isPrivate(methodModifier));
  }
}
