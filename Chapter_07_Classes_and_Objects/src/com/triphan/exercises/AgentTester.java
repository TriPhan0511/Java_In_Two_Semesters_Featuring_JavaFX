package com.triphan.exercises;

public class AgentTester
{
  public static void main(String[] args)
  {
    String codeName;
    String confirm;

    while (true)
    {
      System.out.print("Enter a code name (pattern: Agent...X): ");
      codeName = EasyScanner.nextString();
      if (codeName.length() <= 6
          || codeName.charAt(codeName.length() - 1) != 'X'
          || !codeName.startsWith("Agent"))
      {
        System.out.println("INVALID CODENAME");
      }
      else
      {
        System.out.print("Confirm the code name: ");
        confirm = EasyScanner.nextString();
        if (confirm.equals(codeName))
        {
          System.out.println("CODE NAME CONFIRMED");
        }
        else
        {
          System.out.println("CODE NAME MIS-MATCH");
        }
        break;
      }
    }
  }
}
