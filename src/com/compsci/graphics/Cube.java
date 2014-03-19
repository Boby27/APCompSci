package com.compsci.graphics;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cube extends JPanel
{

  public static void main(String[] args)
  {
      JFrame frame = new JFrame("test");
      frame.setBounds(0,0,300,300);
      Cube cube = new Cube();
      cube.setBackground(java.awt.Color.WHITE);
      frame.getContentPane().add(cube);
      frame.setVisible(true);
  }
  public Cube(){
    
  }
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    
    int width = this.getWidth();
    int height = this.getHeight();
    int sl = 1;
    
    //back rect
    g.setColor(java.awt.Color.BLACK);
    g.drawRect(0,0,width/2,height/2);
    
    
    
  }

}
