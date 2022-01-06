package com.triphan.bankApp;

public class ParameterTest
{
  public static void main(String[] args)
  {
    BankAccount testAccount = new BankAccount("1", "Ann T Dote");
    test(testAccount);
    System.out.println("Account Number: " + testAccount.getAccountNumber());
    System.out.println("Account Name: " + testAccount.getAccountName());
    System.out.println("Balance: " + testAccount.getBalance());
//  ->
//    Account Number: 1
//    Account Name: Ann T Dote
//    Balance: 2500.0
  }

  private static void test(BankAccount account)
  {
    account.deposit(2500);
  }
}
