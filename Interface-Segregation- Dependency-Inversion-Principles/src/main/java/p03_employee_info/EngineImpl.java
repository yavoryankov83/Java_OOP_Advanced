package p03_employee_info;

public class EngineImpl implements Engine {
  private EmployeeInfoProvider employeeInfo;
  private Writer writer;
  private Formatter formatter;

  public EngineImpl(EmployeeInfoProvider employeeInfo, Writer writer, Formatter formatter) {
    this.employeeInfo = employeeInfo;
    this.writer = writer;
    this.formatter = formatter;
  }

  @Override
  public void run() {
    this.writer.writeLine(this.formatter.format(this.employeeInfo.getEmployeesByName()));
  }
}
