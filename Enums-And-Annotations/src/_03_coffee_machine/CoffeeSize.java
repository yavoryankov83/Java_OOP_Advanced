package _03_coffee_machine;

public enum CoffeeSize {
  SMALL(50, 50), 
  NORMAL(100, 75), 
  DOUBLE(200, 100);

  private int dosage;
  private int price;

  CoffeeSize(int dasage, int price) {
    this.dosage = dasage;
    this.price = price;
  }

  public int getDosage() {
    return this.dosage;
  }

  public int getPrice() {
    return this.price;
  }

  @Override
  public String toString() {
    return this.name().charAt(0) + this.name().substring(1).toLowerCase();
  }
}
