package com.triphan.exercises;

public class BankAccountTester
{
  public static void main(String[] args)
  {
    BankAccount acc1 = new BankAccount("123456789", "Hilarry Duff");
    BankAccount acc2 = new BankAccount("987654321", "Alex Ferguson");

    acc1.deposit(200);
    acc2.deposit(100);

    boolean ok = acc1.withdraw(150);
    if (ok)
    {
      System.out.println("WITHDRAWAL SUCCESSFUL");
    }
    else
    {
      System.out.println("INSUFFICIENT FUNDS");
    }

    System.out.println("Balance of acc1: " + acc1.getBalance());
    System.out.println("Balance of acc2: " + acc2.getBalance());
  }
}
