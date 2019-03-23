package model;

public class Coffee implements Comparable<Coffee> {

  private int price;
  private String size;
  private int quantity;

  public Coffee(int price, String size, int quantity) {
    this.price = price;
    this.size = size;
    this.quantity = quantity;
  }

  private int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getSize() {
    return size;
  }

  protected void setSize(String size) {
    this.size = size;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String soldCoffee() {
    return String.format("Sold: %d", this.price * this.quantity);
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public int compareTo(Coffee o) {
    return 0;
  }
}
