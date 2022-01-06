package com.triphan.bankApp;

public class BankTester_0
{
  public static void main(String[] args)
  {
//    Creates a new Bank_0 object
    Bank_0 bank = new Bank_0();

//    Add some new accounts to the bank
    bank.addAccount(new BankAccount("123", "Peter Pan"));
    bank.addAccount(new BankAccount("456", "Alex Sanchez"));
    bank.addAccount(new BankAccount("678", "White Rose"));

//    Display the bank
    bank.displayBank();

////    Retrieves an account and display its information
////    String accountNumber = "456";
//    String accountNumber = "999";
//    BankAccount account = bank.getAccount(accountNumber);
//    displayAnAccount(account);

////    Updates an account's name
//    bank.updateAccountName();

////    Deposits an amount to an account
//    bank.depositToAnAccount();

////    Withdraws from an account
//    ArrayList<BankAccount> accounts = bank.getAccounts();
//    for (BankAccount item : accounts)
//    {
//      item.deposit(2000.0);
//    }
//
////    Test
//    bank.displayBank();
//
//    if (bank.withdrawFromAnAccount())
//    {
//      System.out.println("A withdrawal was made.");
//    }
//
////    Test~
//    bank.displayBank();
  }

  private static void displayAnAccount(BankAccount account)
  {
    if (account == null)
    {
      System.out.println("No account has that account number.");
    }
    else
    {
      System.out.println("Account Number: " + account.getAccountNumber());
      System.out.println("Account Name: " + account.getAccountName());
      System.out.println("Balance: " + account.getBalance());
    }
  }
}


















