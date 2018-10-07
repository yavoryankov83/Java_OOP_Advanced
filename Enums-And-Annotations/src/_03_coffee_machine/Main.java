package _03_coffee_machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String input;

    CoffeeMachine machine = new CoffeeMachine();

    while (!"END".equals(input = reader.readLine())) {
      String[] tokens = input.split("\\s+");

      if (tokens.length == 1) {
        machine.insertCoin(tokens[0]);
      } else {
        machine.buyCoffee(tokens[0], tokens[1]);
      }
    }

    Iterable<Coffee> coffees = machine.coffeeSold();

    for (Coffee coffee : coffees) {
      System.out.println(coffee);
    }
  }
}
