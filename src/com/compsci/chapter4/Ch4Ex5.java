/**
 * CJ Zeiger
 * Chapter 4 Exercise 5
 * Block 3B
 */
package com.compsci.chapter4;
public class Ch4Ex5
{

  public static void main(String[] args)
  {
    System.out.println((1+Math.sqrt(5))/2);
    System.out.println("x10 to the golden ratio: ");
    System.out.print(sum(10)-((1+Math.sqrt(5))/2));
    
    
  }
  public static double sum(int n){
    double current_xn = 1.0;
    double nex_xn = 2.0;
    for (int k =1;k<=n;k++){
      nex_xn = 1+(1/current_xn);
      current_xn = nex_xn;
    }
    return current_xn;
      
  }
  }
