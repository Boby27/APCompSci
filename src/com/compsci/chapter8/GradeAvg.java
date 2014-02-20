package com.compsci.chapter8;

// Chapter 8 Question 9

import java.io.*;
import java.util.Scanner;

public class GradeAvg
{
  public static void main(String[] args)
  {
    Scanner input = null;

    try
    {
      input = new Scanner(new File("res/scores.dat"));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("***  Can't open scores.dat ***");
      System.exit(1);
    }
    int sum =0, count =0;
    while (input.hasNextInt()){
      sum = sum + input.nextInt();
      count++;
    }
    System.out.println("Score Average: " + ((double)sum/(double)count));
  }
}
