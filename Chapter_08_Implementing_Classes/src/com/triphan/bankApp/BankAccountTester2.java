package com.triphan.bankApp;

public class BankAccountTester2
{
  public static void main(String[] args)
  {
//    Creates two bank accounts and makes deposits to them
    BankAccount2 acc1 = new BankAccount2("123", "Alex Ferguson");
    BankAccount2 acc2 = new BankAccount2("456", "Hillary Duff");
    acc1.deposit(1000);
    acc2.deposit(2000);

//    Sets the interest rate
    BankAccount2.setInterestRate(10);

//    Adds the interest to accounts
    acc1.addInterest();
    acc2.addInterest();

//    Displays the account details
    System.out.println("\nAccount number: " + acc1.getAccountNumber());
    System.out.println("Account name: " + acc1.getAccountName());
    System.out.println("Interest rate: " + BankAccount2.getInterestRate());
    System.out.println("Current balance: " + acc1.getBalance());

    System.out.println("\nAccount number: " + acc2.getAccountNumber());
    System.out.println("Account name: " + acc2.getAccountName());
    System.out.println("Interest rate: " + BankAccount2.getInterestRate());
    System.out.println("Current balance: " + acc2.getBalance());
  }
}
