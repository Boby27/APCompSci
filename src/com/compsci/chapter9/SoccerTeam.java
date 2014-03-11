/**
 * CJ Zeiger
 * SoccerTeam
 * Block 3B
 * March 11th, 2014
 */
package com.compsci.chapter9;

public class SoccerTeam
{
  private int _wins;
  private int _loses;
  private int _ties;
  private static int _games;
  private static int _goals;
  public void played(SoccerTeam other, int myScore, int otherScore){
    _games++;
    _goals += myScore;
    _goals += otherScore;
    if (myScore > otherScore) {
      _wins++;
      other._loses++;
    } else if(otherScore > myScore) {
      _loses++;
      other._wins++;
    } else {
      _ties++;
      other._ties++;
    }
  }
  public int points(){
    return _wins*3 + _ties;
  }
  public void reset(){
    _wins = 0;
    _loses = 0;
    _ties = 0;
  }
  public static int getGames(){
    return _games;
  }
  public static int getGoals(){
    return _goals;
  }
  public static void startTournament(){
    _games = 0;
    _goals = 0;
  }
}
