package _01_bankAccount_test.tests;

import _01_bankAccount_test.BankAccount;
import org.junit.Assert;
import org.junit.Test;

public class BankAccountTests {

  @Test
  public void depositAmount() {
    BankAccount account = new BankAccount();
    account.deposit(20);
    Assert.assertTrue(account.getBalance() == 20);
  }

  @Test
  public void withDrawAmount() {
    BankAccount account = new BankAccount();
    account.deposit(20);
    account.withDraw(10);
    Assert.assertTrue(account.getBalance() == 10);
  }

  @Test(expected = IllegalArgumentException.class)
  public void withDrawNegativeAmount() {
    BankAccount account = new BankAccount();
    account.deposit(20);
    account.withDraw(-10);
  }
}
