package p03_employee_info;

public class Main {

  public static void main(String[] args) {
    EmployeeInfoProvider employeeInfo = new EmployeeInfoProviderImpl(new EmployeeDatabase());
    Writer writer = new ConsoleClient();
    Formatter formatter = new ConsoleFormatter();

    Engine engine = new EngineImpl(employeeInfo, writer, formatter);
    engine.run();
  }
}
