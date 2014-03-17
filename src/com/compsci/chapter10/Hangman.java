package com.compsci.chapter10;

public class Hangman
{
  private String secret = "";
  private String display = "";
  private int numLeft;
  public Hangman(String s){
      secret = s.toLowerCase();
      numLeft = 6;
      for (int x = secret.length(); x>0;x--){
        display += "*";
      }
  }
  public boolean keepPlaying(){
    if (numLeft > 0 && !display.equals(secret)){
      return true;
    } else{
      return false;
    }
  }
  public void guess(String letter){
    boolean match = false;
    letter = letter.toLowerCase();
    for (int n = 0;n<secret.length();n++){
      if(secret.charAt(n) == letter.charAt(0)){
        replace(n,letter);
        match = true;
      }
    }
    if (match == false){
      numLeft--;
    }
  }
  public boolean won(){
    if (secret.equals(display)){
      return true;
    } else {
      return false;
    }
  }
  public void replace(int index, String s){
    String temp = display.substring(0,index);
    temp += s;
    temp += display.substring(index+1);
    display = temp;
  }
  public String getSecret(){
    return secret;
  }
  public String toString(){
    String x = display + "\tYou Have ";
    x = x + numLeft + " guesses left";
    return x;
  }
}
