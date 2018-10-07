package _03_generic_scale;

public class Main {
  public static void main(String[] args) {

    Scale<String> str = new Scale<>("a", "c");

    System.out.println(str.GetHavier());
  }
}
