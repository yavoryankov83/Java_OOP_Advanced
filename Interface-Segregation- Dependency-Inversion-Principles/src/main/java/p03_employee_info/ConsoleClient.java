package p03_employee_info;

public class ConsoleClient implements Writer {

  @Override
  public void writeLine(String line) {
    System.out.println(line);
  }
}
