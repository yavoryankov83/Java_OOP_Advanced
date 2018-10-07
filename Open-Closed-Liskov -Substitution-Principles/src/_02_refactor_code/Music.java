package _02_refactor_code;

public class Music implements Streamable {

  private String artist;
  private String album;
  private int length;
  private int bytesSent;

  public Music(int length, int bytesSent) {
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
