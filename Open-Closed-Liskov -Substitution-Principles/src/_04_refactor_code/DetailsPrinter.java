package _04_refactor_code;

public class DetailsPrinter {

  private Iterable<Employee> employees;

  public DetailsPrinter(Iterable<Employee> employees) {
    this.employees = employees;
  }

  public void printDetails() {s
    for (Employee employee : employees) {
      this.printEmployee(employee);
    }
  }

  private void printEmployee(Employee employee) {
    System.out.println(employee);
  }

}
