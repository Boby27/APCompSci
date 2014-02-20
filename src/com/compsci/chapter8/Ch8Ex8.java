package com.compsci.chapter8;

public class Ch8Ex8
{

  public static void main(String[] args)
  {
    System.out.println(div3(14348907));
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
      if (number == 9 || number == 6|| number==3){
        return true;
      }
      else if (number < 10)
        return false;
      else if (div3(sumDigits(number))){
        return true;
      }
      
      return false;
  }

}
