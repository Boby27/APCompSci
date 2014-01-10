package com.compsci.chapter6;

// Chapter 6 Question 19

// CJ Zeiger

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  private Color skyColor = Color.CYAN;

  public Rainbow()
  {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();
    int xCenter = (int) (width/2.0);
    int yCenter = (int) (height * (3.0/4.0));
    int largeRadius = (int) (0.25 * width);
    int greenRadius = (int) (0.25 * height);
    int magRadius = (int)Math.sqrt(greenRadius*largeRadius);
    int innerRadius = (int) ((1.5*greenRadius)-(largeRadius*0.5));
    g.setColor(Color.RED);

    g.fillArc(xCenter-largeRadius, yCenter-largeRadius, 2*largeRadius, 2*largeRadius, 0,180);
    g.setColor(Color.MAGENTA);
    g.fillArc(xCenter-magRadius, yCenter-magRadius, 2*magRadius, 2*magRadius, 0,180);
    g.setColor(Color.GREEN);
    g.fillArc(xCenter-greenRadius, yCenter-greenRadius, 2*greenRadius, 2*greenRadius, 0,180);
    
    g.setColor(skyColor);
    g.fillArc(xCenter-innerRadius, yCenter-innerRadius, 2*innerRadius, 2*innerRadius, 0,180);
  }
  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
