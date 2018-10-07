package _02_refactor_code;

public class File implements Streamable {

  private String name;
  private int length;
  private int bytesSent;

  public File(int length, int bytesSent) {
    this.length = length;
    this.bytesSent = bytesSent;
  }

  public int getLength() {
    return length;
  }

  public int getBytesSent() {
    return bytesSent;
  }
}
