package com.compsci.chapter7.RollingDice;

public class Die
{
  private int roll;
  public Die(){
  }
  public void roll(){
    roll =  (int) ((Math.random()*6.0)+1);
  }
  public int getNumDots(){
    return roll;
  }
}
