package com.compsci.chapter11;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Dionaea extends Flower
{
  public Dionaea(){
    super(null);
  }
  public Dionaea(Color color){
    super(color);
  }
  public void turn(){
    setDirection(getDirection()+45);
  }
  public boolean canEat(){
    Grid<Actor> gr = getGrid();
    if(gr==null){
      return false;
    }
    Location me = getLocation();
    Location next = me.getAdjacentLocation(getDirection());
    return gr.get(next) instanceof Bug;
  }
  public void eat(){
    Grid<Actor> gr = getGrid();
    Location next = getLocation().getAdjacentLocation(getDirection());
    gr.get(next).removeSelfFromGrid();
  }
  public void act(){
    if(canEat()){
      eat();
    } else{
      turn();
    }
  }
}
