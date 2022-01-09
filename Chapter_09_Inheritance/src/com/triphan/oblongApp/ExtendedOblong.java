package com.triphan.oblongApp;

public class ExtendedOblong extends Oblong
{
  private char symbol;

  public ExtendedOblong(double length, double height, char symbol)
  {
    super(length, height);
    this.symbol = symbol;
  }

  public void setSymbol(char symbol)
  {
    this.symbol = symbol;
  }

  public String draw()
  {
    StringBuilder builder = new StringBuilder();
    int l = (int) getLength();
    int h = (int) getHeight();
    for (int i = 0; i < h; i++)
    {
      for (int k = 0; k < l; k++)
      {
        builder.append(symbol);
      }
      builder.append("\n");
    }
    return builder.toString();
  }
}




























