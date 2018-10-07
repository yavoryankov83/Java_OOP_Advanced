package _02_warning_levels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String input;

    Logger logger = new Logger(reader.readLine());

    while (!"END".equals(input = reader.readLine())) {
      String[] tokens = input.split(": ");

      String importance = tokens[0];
      String message = tokens[1];

      logger.addMessage(importance, message);
    }

    Iterable<Message> result = logger.getMessage();

    for (Message message : result) {
      System.out.println(message);
    }
  }
}
