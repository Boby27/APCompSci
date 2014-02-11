package com.compsci.chapter8;

public class TestClass
{

  public static void main(String[] args)
  {
    int k = 0, q = 0;
    int v= 2;
    do{
        k = k * k + 3 * v;
        q = (int) Math.sqrt(q+v+1);
        v = v*3;
        
    }while ((v/3) <= 195);
    System.out.println(q);
    System.out.println(k);
    System.out.println(v);
  }

}
