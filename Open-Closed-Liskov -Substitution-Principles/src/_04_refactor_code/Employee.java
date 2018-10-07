package _04_refactor_code;

public class Employee {
  private String name;

  public Employee(String name) {
    this.name = name;
  }s

  private String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Name: " + this.getName();
  }
}
