package _02_refactor_code;

public class Main {
  public static void main(String[] args) {

    StreamProgressInfo file = new StreamProgressInfo(new File(100, 20));
    StreamProgressInfo music = new StreamProgressInfo(new Music(40, 10));

    System.out.println(file.calculateCurrentPercent());
    System.out.println(music.calculateCurrentPercent());
  }
}
