package com.compsci.chapter4;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Morning extends JFrame implements ActionListener
{
  private EasySound rooster;
  private EasySound cow;
  private int time;
  private Container c;
  private boolean day = true;

  /**
   *   Constructor
   */
  public Morning()
  {
    super("Morning");
    time = 0;
    Timer clock = new Timer(5000, this); 
    rooster = new EasySound("roost.wav");
    cow = new EasySound("moo.wav");
    c = getContentPane();
    c.setBackground(Color.WHITE);
    actionPerformed(null);
    clock.start();

  }
  
  public void actionPerformed(ActionEvent e)
  {
    if (day){
      c.setBackground(Color.WHITE);
      rooster.play();
      day =false;
    }
    else{
      c.setBackground(Color.BLACK);
      cow.play();
      day=true;
    }
    
  }
  public static void main(String[] args)
  {
    Morning morning = new Morning();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}  
