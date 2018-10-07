package _04_refactor_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    Employee employee1 = new Employee("Ivan");
    Employee employee2 = new Employee("Kiril");
    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(employee1);
    employeeList.add(employee2);

    List<String> docs = new ArrayList<>();
    Collections.addAll(docs, "copy1", "copy2");

    Manager manager1 = new Manager("Gosho", docs);
    Manager manager2 = new Manager("Martin", docs);
    employeeList.add(manager1);
    employeeList.add(manager2);

    DetailsPrinter detailsPrinter = new DetailsPrinter(employeeList);
    detailsPrinter.printDetails();
  }
}
