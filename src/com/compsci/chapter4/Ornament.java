/**
 * CJ Zeiger
 * December 12th, 2013
 * Chapter 4 Exercise 19 - Ornament Program
 * Block 3B
 */
package com.compsci.chapter4;
/**
 * This program draws an ornament of nested triangles
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ornament extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    drawTriangles(g, 100, 100, 64);
  }

  /**
   * Draws an ornament made of triangles in Graphics g
   * with the base midpoint at (x, y) and base half-length r
   */
  public void drawTriangles(Graphics g, int x, int y, int r)
  {
   if (r>=4){ 
   g.drawLine(x,y-r,x-r,y);
   g.drawLine(x,y-r,x+r,y);
   drawTriangles(g,(x-(r/2)),y,(r/2));
   drawTriangles(g,(x+(r/2)),y,(r/2));
   }
   else{
     g.drawLine(x-r,y,x+r,y);
   }
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Triangles");
    w.setBounds(300, 300, 200, 140);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Ornament panel = new Ornament();
    panel.setBackground(Color.WHITE);
    Container c = w.getContentPane();
    c.add(panel);
    w.setResizable(false);
    w.setVisible(true);
  }
}
