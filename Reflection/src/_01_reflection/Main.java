package _01_reflection;

import sun.reflect.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
  public static void main(String[] args) throws NoSuchMethodException,
          IllegalAccessException,
          InvocationTargetException,
          InstantiationException {

    //Reflection over class Audi
    Class<Audi> audi = Audi.class;

    audi.getTypeName();
    audi.getSuperclass().getTypeName();
    audi.getInterfaces();
    audi.getDeclaredConstructor().getName();

    //make instance ot the class using Reflection
    Constructor audiConstructor = audi.getDeclaredConstructor(String.class);

    Audi currInstance = (Audi) audiConstructor.newInstance("A4");
    System.out.println(currInstance.getModel());
  }
}
