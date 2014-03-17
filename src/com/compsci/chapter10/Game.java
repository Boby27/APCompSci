package com.compsci.chapter10;

import java.util.Scanner;

public class Game
{

  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a new word: ");
    String w = in.nextLine();
    Hangman h = new Hangman(w);
    for(int i = 1;i<=20;i++){
      System.out.println("");
    }
    System.out.println(h);
    while(h.keepPlaying()){
      String guess = in.nextLine();
      h.guess(guess);
      System.out.printf("You guessed a(n) %s \n", guess);
      System.out.println(h.toString());
    }
    if(h.won()){
      System.out.printf("You won by guessing the word %s",h.getSecret());
    } else {
      System.out.printf("You lost. The word was %s",h.getSecret());
    }
  }

}
