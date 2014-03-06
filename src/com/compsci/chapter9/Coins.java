package com.compsci.chapter9;

import java.util.Scanner;

public class Coins
{
  private int cents;
  private int quarters;
  private int dimes;
  private int nickels;
  private int pennies;
  
  public Coins(int cents){
    this.cents = cents;
    
    int change = cents;
    while (change >= 25){
      quarters++;
      change = change - 25;
    }
    while (change >= 10){
      dimes++;
      change = change - 10;
    }
    while (change >= 5){
      nickels++;
      change = change - 5;
    }
    pennies = change;
    
  }
  //Return Coin Counts
  public int getQuarters(){
    return quarters;
  }
  public int getDimes(){
    return dimes;
  }
  public int getNickels(){
    return nickels;
  }
  public int getPennies(){
    return pennies;
  }
  public static void main(String[] args){
    System.out.println("Input cent amount: ");
    java.util.Scanner in = new Scanner(System.in);
    int myCents = in.nextInt();
    Coins test = new Coins(myCents);
    System.out.println(test.getQuarters() +" Quarters and " + test.getDimes() + " Dimes and " + test.getNickels() + " Nickels and " + test.getPennies() + " Pennies");
  }
}
