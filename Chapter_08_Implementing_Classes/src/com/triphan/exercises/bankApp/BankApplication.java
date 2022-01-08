package com.triphan.exercises.bankApp;

import com.triphan.exercises.easyScanner.EasyScanner;

// Exercise: chapter 08 Implementing classes / exercise 06
public class BankApplication
{
  public static void main(String[] args)
  {
    Bank bank = new Bank();
    char choice;
    do
    {
      System.out.println();
      System.out.println("1. Create a new account");
      System.out.println("2. Remove an account");
      System.out.println("3. Deposit money");
      System.out.println("4. Withdraw money");
      System.out.println("5. Check an account details.");
      System.out.println("6. Quit");
      System.out.println();
      System.out.print("Enter choice [1-6]: ");
      choice = EasyScanner.nextChar();
      switch (choice)
      {
        case '1':
          createAccount(bank);
          break;
        case '2':
          removeAccount(bank);
          break;
        case '3':
          depositMoney(bank);
          break;
        case '4':
          withdrawMoney(bank);
          break;
        case '5':
          displayAccountDetails(bank);
          break;
        case '6':
          break;
        default:
          System.out.println("Invalid entry.");
      }
    } while (choice != '6');
  }

//  Adds account
  private static void createAccount(Bank bank)
  {
//    Gets detail from user
    System.out.print("Enter an account number: ");
    String number = EasyScanner.nextString();
    System.out.print("Enter an account name: ");
    String name = EasyScanner.nextString();
//    Adds account to the list
    if (bank.addAccount(number, name))
    {
      System.out.println("Account added.");
    }
    else
    {
      System.out.println("This account number already exists.");
    }
  }

//  Removes account
  private static void removeAccount(Bank bank)
  {
//    Gets account number of account to remove
    System.out.print("Enter an account number: ");
    String number = EasyScanner.nextString();
//    Delete item if it exists
    if (bank.removeAccount(number))
    {
      System.out.println("Account removed.");
    }
    else
    {
      System.out.println("This account number does not exist.");
    }
  }

//  Deposits money in an account
  private static void depositMoney(Bank bank)
  {
//    Gets detail from user
    System.out.print("Enter an account number: ");
    String number = EasyScanner.nextString();
    System.out.print("Enter an amount: ");
    double amount = EasyScanner.nextDouble();

    int i = bank.depositMoney(number, amount);
    if (i == -1)
    {
      System.out.println("No such account");
    } else if (i == -2)
    {
      System.out.println("The amount should be greater than zero.");
    }
    else
    {
      System.out.println("Money deposited.");
    }
  }

//  Withdraws money from an account
  private static void withdrawMoney(Bank bank)
  {
//    Gets detail from user
    System.out.print("Enter an account number: ");
    String number = EasyScanner.nextString();
    System.out.print("Enter an amount: ");
    double amount = EasyScanner.nextDouble();
    int i = bank.withdraw(number, amount);
    if (i == -1)
    {
      System.out.println("No such account.");
    }
    else if (i == -2)
    {
      System.out.println("Inefficient funds.");
    }
    else
    {
      System.out.println("Money withdrawn.");
    }
  }

//  Checks account details
  private static void displayAccountDetails(Bank bank)
  {
    System.out.print("Enter an account number: ");
    String number = EasyScanner.nextString();
    BankAccount account = bank.getItem(number);
    if (account == null)
    {
      System.out.println("This account number does not exist.");
    }
    else
    {
      System.out.println("Account Number: " + account.getAccountNumber());
      System.out.println("Account Name: " + account.getAccountName());
      System.out.println("Balance: " + account.getBalance());
    }
  }
}



















