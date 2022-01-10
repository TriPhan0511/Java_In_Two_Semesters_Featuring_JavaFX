package com.triphan.exercises.oblongApp;

public class ExtendedOblong extends Oblong
{
  private char symbol;

  public ExtendedOblong(double lengthIn, double heightIn, char symbolIn)
  {
    super(lengthIn, heightIn);
    symbol = symbolIn;
  }

  public void setSymbol(char symbolIn)
  {
    symbol = symbolIn;
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
