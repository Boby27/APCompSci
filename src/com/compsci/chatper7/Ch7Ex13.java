package com.compsci.chatper7;

public class Ch7Ex13{

  public static void main(String []args){
     System.out.println(isLater(5,23,2012,4,29,2012));
  }
  public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2){
      int days1 = (month1 * 30) + (year1 * 365) + day1;
      int days2 = (month2 * 30) + (year2 * 365) + day2;
      
      if (days1 > days2)
         return true;
      else 
         return false;
      
      
  }
}