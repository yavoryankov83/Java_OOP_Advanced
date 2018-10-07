package _02_generic_array_creator;

public class Main {
  public static void main(String[] args) {

    Integer[] integers = ArrayCreator.create(Integer.class, 10, 0);
  }
}
