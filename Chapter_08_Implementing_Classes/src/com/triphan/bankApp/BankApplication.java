package com.triphan.bankApp;

import com.triphan.easyScanner.EasyScanner;

public class BankApplication
{
  public static void main(String[] args)
  {
    Bank bank = new Bank();
    char choice;
    do
    {
      System.out.println();
      System.out.println("1. Create an account");
      System.out.println("2. Remove an account");
      System.out.println("3. Deposit money");
      System.out.println("4. Withdraw money");
      System.out.println("5. Check account details");
      System.out.println("6. Quit");
      System.out.println();
      System.out.print("Enter choice [1-6]: ");
      choice = EasyScanner.nextChar();
      System.out.println();
      switch (choice)
      {
        case '1':
          option1(bank);
          break;
        case '2':
          option2(bank);
          break;
        case '3':
          option3(bank);
          break;
        case '4':
          option4(bank);
          break;
        case '5':
          option5(bank);
          break;
        case '6':
          break;
        default:
          System.out.println("Invalid entry.");
      }
    } while (choice != '6');
  }

//  Adds an account
  private static void option1(Bank bank)
  {
    System.out.print("Enter an account number: ");
    String number = EasyScanner.nextString();
    System.out.print("Enter an account name: ");
    String name = EasyScanner.nextString();
    if (bank.addItem(number, name))
    {
      System.out.println("Account added.");
    }
    else
    {
      System.out.println("Account number already exists.");
    }

//    Test
    System.out.println();
    System.out.println("After adding an account");
  }

//  Removes an account
  private static void option2(Bank bank)
  {
    System.out.print("Enter an account number: ");
    String number = EasyScanner.nextString();
    if (bank.removeAccount(number))
    {
      System.out.println("Account removed.");
    }
    else
    {
      System.out.println("No such account number.");
    }

//    Test
    System.out.println();
    System.out.println("After deleting an account");
  }

  //  Deposits money in an account
  private static void option3(Bank bank)
  {
    System.out.print("Enter an account number: ");
    String number = EasyScanner.nextString();
    System.out.print("Enter an amount: ");
    double amount = EasyScanner.nextDouble();
    if (bank.depositMoney(number, amount))
    {
      System.out.println("Money deposited.");
    }
    else
    {
      System.out.println("No such account.");
    }
  }

  //  Withdraws money from an account
  private static void option4(Bank bank)
  {
    System.out.print("Enter an account number: ");
    String number = EasyScanner.nextString();
    System.out.print("Enter an amount: ");
    double amount = EasyScanner.nextDouble();
    if (bank.withdrawMoney(number, amount))
    {
      System.out.println("Withdrawal made.");
    }
    else
    {
      System.out.println("No such account or insufficient funds.");
    }
  }

  //  Display an account details
  private static void option5(Bank bank)
  {
    System.out.print("Enter an account number: ");
    String number = EasyScanner.nextString();
    BankAccount account = bank.getItem(number);
    if (account == null)
    {
      System.out.println("No such account.");
    }
    else
    {
      System.out.println("Account number: " + account.getAccountNumber());
      System.out.println("Account name: " + account.getAccountName());
      System.out.println("Balance: " + account.getBalance());
    }
  }
}






























