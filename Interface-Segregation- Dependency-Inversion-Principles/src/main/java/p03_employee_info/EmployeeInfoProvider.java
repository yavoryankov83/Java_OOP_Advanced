package p03_employee_info;

import java.util.List;

public interface EmployeeInfoProvider {
  List<Employee> getEmployeesByName();

  Iterable<Employee> getEmployeesBySalary();
}
