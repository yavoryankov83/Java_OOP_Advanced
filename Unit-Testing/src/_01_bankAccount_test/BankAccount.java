package _01_bankAccount_test;

public class BankAccount {
  private double balance;

  public BankAccount() {
    this.balance = balance;
  }

  public double getBalance() {
    return this.balance;
  }

  public void deposit(double amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("Amount can't be negative");
    }
    this.balance += amount;
  }

  public void withDraw(double amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("Amount can't be negative");
    } else if (this.balance < amount) {
      throw new IllegalArgumentException("Not enought money");
    }
    this.balance -= amount;
  }
}
