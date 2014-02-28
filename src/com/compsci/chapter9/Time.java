package com.compsci.chapter9;

public class Time
{
  public int hours;
  public int minutes;
  
  public Time(int h, int m){
    if (h >=0 && h < 24 && m >= 0 && m < 60){
      hours = h;
      minutes = m;
    } else {
      throw new IllegalArgumentException();
    }
  }
  private int toMins(){
    return minutes + (hours*60);
  }
  
  public boolean lessThan(Time t) {
    if (hours > t.hours){
      return false;
    } else if (hours == t.hours){
      if (minutes < t.minutes){
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }
  public int elapsedSince(Time previousTime){
    int thisMins = toMins();
    int otherMins = previousTime.toMins();
    if (lessThan(previousTime)){
      return thisMins + (24*60) - otherMins;
    } else {
      return thisMins - otherMins;
    }
  }
  public String toString(){
    return "" + hours + "h and " + minutes + "m";
  }

}
