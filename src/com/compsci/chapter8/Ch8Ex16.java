package com.compsci.chapter8;

public class Ch8Ex16
{
  private static int count;
  public static void main(String[] args)
  {
    combos(100);
    System.out.println(""+count);
  }
  private static void combos(int c){
    int p = c;
    int n = c/5;
    int d = c/10;
    int q = c/25;
    for(int i=0;i<=p;i++){
      for(int a=0;a<=n;a++){
        for(int b=0;b<=d;b++){
          for(int e=0;e<=q;e++){
            if(i+(a*5)+(b*10)+(e*25)==c){
              print(i,a,b,e,c);
            }
          }
        }
        
      }
    }
  }
  private static void print(int p, int n, int d, int q, int c){
    System.out.println(c+" cents = " + q +" quarterts + " + d + " dimes " + n + " nickels + " + p  +" pennies ");
    count++;
  }

}
