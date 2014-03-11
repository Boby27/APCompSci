package com.compsci.chapter9;

public class TestSoccer
{
  private SoccerTeam team1, team2, team3, team4;
  public static void main(String[] args)
  {
    TestSoccer test = new TestSoccer();
  }
  public TestSoccer(){
    team1 = new SoccerTeam();
    team2 = new SoccerTeam();
    team3 = new SoccerTeam();
    team4 = new SoccerTeam();
    playGames();
    printStats();
  }
  private void playGames(){
    SoccerTeam.startTournament();
    
    team1.played(team2, 1,2);
    team2.played(team3, 2,2);
    team3.played(team1, 3,2);
    team1.played(team4, 1,1);
  }
  private void printStats(){
    System.out.println("Point of each team ... Team1: " + team1.points() + " Team2: " + team2.points() + " Team3: "+ team3.points() + " Team4: "+ team4.points());
    System.out.println(SoccerTeam.getGoals() + " total goals scored and " + SoccerTeam.getGames() + " total games played");
  }

}
