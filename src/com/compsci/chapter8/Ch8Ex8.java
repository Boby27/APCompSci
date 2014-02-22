package com.compsci.chapter8;

public class Ch8Ex8
{

  public static void main(String[] args)
  {
    System.out.println(div3(9));
  }
  private static int sumDigits(int number){
    int sum =0;
    int digits = (int)Math.log10(number)+1;
    while(digits>0){
      int mag = (int)(Math.pow(10,(double)(digits-1)));
      int place = (int)(number/mag);
      sum = sum + place;
      number = number - place*mag;
      digits--;
    }
    return sum;
  }
  private static boolean div3(int number){
      if (number/3 == 1){
        return true;
      }
      else if (div3(sumDigits(number))){
        return true;
      }
      else
    return false;
  }
}
