package com.compsci.chapter11;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class BugRunner
{

  public static void main(String[] args)
  {
    ActorWorld world = new ActorWorld();
    world.add(new Location(0,1), new SlowBug());
    world.add(new Location(0,2), new Bug());
    world.show();
  }

}
