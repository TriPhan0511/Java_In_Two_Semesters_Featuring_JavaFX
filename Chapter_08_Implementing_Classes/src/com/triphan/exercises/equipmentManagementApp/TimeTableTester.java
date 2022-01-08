package com.triphan.exercises.equipmentManagementApp;

import com.triphan.exercises.easyScanner.EasyScanner;

// Exercise: chapter 08 Implementing classes / exercise 08
public class TimeTableTester
{
  public static void main(String[] args)
  {
    TimeTable timeTable = new TimeTable(3, 2);
    char choice;
    do
    {
      System.out.println();
      System.out.println("1. Make a booking");
      System.out.println("2. Cancel a booking");
      System.out.println("3. Check for available slot.");
      System.out.println("4. Display a booking details.");
      System.out.println("5. Exit.");
      System.out.println();
      System.out.print("Enter choice [1-5]: ");
      choice = EasyScanner.nextChar();
      switch (choice)
      {
        case '1':
          makeBooking(timeTable);
          break;
        case '2':
          cancelBooking(timeTable);
          break;
        case '3':
          checkAvailable(timeTable);
          break;
        case '4':
          displayBookingDetails(timeTable);
          break;
        case '5':
          System.out.println("Goodbye!");
          break;
        default:
          System.out.println("Invalid entry.");
      }
    } while (choice != '5');
  }

  private static void makeBooking(TimeTable timeTable)
  {
    System.out.print("Enter a room number: ");
    String room = EasyScanner.nextString();
    System.out.print("Enter a name: ");
    String name = EasyScanner.nextString();
    int day;
    do
    {
      System.out.print("Enter a day: ");
      day = EasyScanner.nextInt();
      if (day < 1)
      {
        System.out.println("You should enter a number is greater than or equal to 1.");
      }
    } while (day < 1);

    int period;
    do
    {
      System.out.print("Enter a period: ");
      period = EasyScanner.nextInt();
      if (period < 1)
      {
        System.out.println("You should enter a number is greater than or equal to 1.");
      }
    } while (period < 1);
    if (timeTable.makeBooking((day - 1), (period - 1), new Booking(room, name)))
    {
      System.out.println("Booking successfully.");
    }
    else
    {
      System.out.println("Please check the day and period.");
      System.out.println("Day should be between 1 and "
          + timeTable.numberOfDays());
      System.out.println("and period should be between 1 and "
          + timeTable.numberOfPeriods() + ".");
      System.out.println("Or maybe the slot you want to book is not available now.");
    }
  }

  private static void cancelBooking(TimeTable timeTable)
  {
    int day;
    do
    {
      System.out.print("Enter a day: ");
      day = EasyScanner.nextInt();
      if (day < 1)
      {
        System.out.println("You should enter a number is greater than or equal to 1.");
      }
    } while (day < 1);

    int period;
    do
    {
      System.out.print("Enter a period: ");
      period = EasyScanner.nextInt();
      if (period < 1)
      {
        System.out.println("You should enter a number is greater than or equal to 1.");
      }
    } while (period < 1);
    if (timeTable.cancelBooking((day-1), (period-1)))
    {
      System.out.println("Cancel a booking successfully.");
    }
    else
    {
      System.out.println("Please check the day and period.");
      System.out.println("Day should be between 1 and "
          + timeTable.numberOfDays());
      System.out.println("and period should be between 1 and "
          + timeTable.numberOfPeriods() + ".");
      System.out.println("Or maybe the slot you want to cancel was not booked.");
    }
  }

  private static void checkAvailable(TimeTable timeTable)
  {
    int day;
    do
    {
      System.out.print("Enter a day: ");
      day = EasyScanner.nextInt();
      if (day < 1)
      {
        System.out.println("You should enter a number is greater than or equal to 1.");
      }
    } while (day < 1);

    int period;
    do
    {
      System.out.print("Enter a period: ");
      period = EasyScanner.nextInt();
      if (period < 1)
      {
        System.out.println("You should enter a number is greater than or equal to 1.");
      }
    } while (period < 1);
    if (timeTable.isFree((day-1), (period-1)))
    {
      System.out.print("The slot is available now. Do you want to book(y/n)? ");
      char choice = EasyScanner.nextChar();
      if (choice == 'y' || choice == 'Y')
      {
        System.out.print("Enter a room number: ");
        String room = EasyScanner.nextString();
        System.out.print("Enter a name: ");
        String name = EasyScanner.nextString();
        if (timeTable.makeBooking((day-1), (period-1), new Booking(room, name)))
        {
          System.out.println("Make a booking successfully.");
        }
      }
    }
    else
    {
      System.out.println("This slot is not available now.");
    }
  }

  private static void displayBookingDetails(TimeTable timeTable)
  {
    int day;
    do
    {
      System.out.print("Enter a day: ");
      day = EasyScanner.nextInt();
      if (day < 1)
      {
        System.out.println("You should enter a number is greater than or equal to 1.");
      }
    } while (day < 1);

    int period;
    do
    {
      System.out.print("Enter a period: ");
      period = EasyScanner.nextInt();
      if (period < 1)
      {
        System.out.println("You should enter a number is greater than or equal to 1.");
      }
    } while (period < 1);
    Booking b = timeTable.getBooking((day-1), (period-1));
    if (b == null)
    {
      System.out.println("This slot was not booked.");
    }
    else
    {
      b.displayBookingDetails();
    }
  }
}

























