package com.triphan.oblongApp;

public class ExtendedOblongTester
{
  public static void main(String[] args)
  {
    ExtendedOblong oblong = new ExtendedOblong(5, 3, '*');
    System.out.println(oblong.draw());
//    ->
    /*
     *****
     *****
     *****
     */

    oblong.setSymbol('$');
    System.out.println(oblong.draw());
//    ->
    /*
     $$$$$
     $$$$$
     $$$$$
     */
  }
}
