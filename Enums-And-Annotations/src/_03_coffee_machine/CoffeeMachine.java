package _03_coffee_machine;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {

  private List<Coffee> coffeList;
  private int money;

  public CoffeeMachine() {
    this.coffeList = new ArrayList<>();
  }

  public void buyCoffee(String size, String type) {
    Coffee coffee = new Coffee(Enum.valueOf(CoffeeSize.class, size.toUpperCase()),
            Enum.valueOf(CoffeeType.class, type.toUpperCase()));

    if (coffee.getPrice() <= this.money) {
      this.coffeList.add(coffee);
      this.money = 0;
    }
  }

  public void insertCoin(String coin) {
    this.money += Enum.valueOf(Coin.class, coin.toUpperCase()).getValue();
  }

  public Iterable<Coffee> coffeeSold() {
    return this.coffeList;
  }
}
