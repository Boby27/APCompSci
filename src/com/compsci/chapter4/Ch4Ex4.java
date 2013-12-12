package com.compsci.chapter4;

public class Ch4Ex4
{

  public static void main(String[] args)
  {
    int n = 37;
    int b = 2;
    int p = 1;
    while (p <= n)
    {
      n = n - p;
      p = p * b;
    }
    System.out.println(n);
  }
}
// Output is 6