package _01_jarOfT;

public class Main {
  public static void main(String[] args) {

    Jar<String> jar = new Jar<>();

    jar.add("Pesho");
    jar.add("Yavor");
    jar.add("Ivan");

    System.out.println(jar.remove());
  }
}
