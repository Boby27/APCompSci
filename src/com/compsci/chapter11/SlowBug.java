package com.compsci.chapter11;

import java.awt.Color;

import info.gridworld.actor.Bug;

public class SlowBug extends Bug
{
  private int turn = 0;
  public SlowBug(){
    
  }
  public SlowBug(Color color){
    super(color);
  }
  public void act(){
    if(turn < 2){
      turn++;
    } else {
      turn = 0;
      super.act();
    }
  }
}
