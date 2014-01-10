package com.compsci.chapter6;
/**
 * CJ Zeiger
 * January 10th, 2014
 * Chapter 6 Lab Chapter - Poll Program
 * Block 3B
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PollDisplayPanel extends JPanel
{
  private String name1, name2, name3;
  private int count1, count2, count3;
  PollDisplayPanel(String nm1, String nm2, String nm3)
  {
    setBackground(Color.WHITE);
    name1 = nm1;
    name2 = nm2;
    name3 = nm3;
    count1 = 0;   // optional
    count2 = 0;   // optional
    count3 = 0;   // optional
  }
  public void vote1()
  {
    count1++;
  }
  public void vote2()
  {
   count2++;
   }
  public void vote3()
  {
    count3++;
  }
  public String toString()
  {
    return name1 + ": " + count1 + " " + name2 + ": " + count2 + " " + name3 + ": " + count3;
  }
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int w = getWidth();
    int h = getHeight();
    int x = w/2;
    int y = h/2;
    int r = Math.min(w, h) / 4;
    drawPieChart(g, x, y, r);
    drawLegend(g, x, y, r);
  }
  private void drawPieChart(Graphics g, int x, int y, int r)
  {
    int total = count1 + count2 + count3;
    int fromDegree = 0;

    if (total > 0)
    {
      int degrees;
      g.setColor(Color.RED);
      degrees = countToDegrees(count1, total);
      drawSector(g, x, y, r, fromDegree, degrees);
      fromDegree = fromDegree + degrees;
      
      g.setColor(Color.GREEN);
      degrees = countToDegrees(count2, total);
      drawSector(g, x, y, r, fromDegree, degrees);
      fromDegree = fromDegree + degrees;
      
      g.setColor(Color.BLUE);
      drawSector(g, x, y, r, fromDegree, Math.max(360-fromDegree,0));
    }
    else
    {
      g.setColor(Color.LIGHT_GRAY);
      drawSector(g, x, y, r, fromDegree, 360);
    }
  }
  private void drawLegend(Graphics g, int x, int y, int r)
  {
    y += (r + 20);
    g.setColor(Color.BLACK);
    g.drawString(Integer.toString(count1) , x - r, y);
    g.drawString(Integer.toString(count2), x, y);
    g.drawString(Integer.toString(count3), x + r, y);
    y += 5;
    x -= 2;
    g.setColor(Color.RED);
    g.fillRect(x - r, y, 10, 10);
    g.setColor(Color.GREEN);
    g.fillRect(x, y, 10, 10);
    g.setColor(Color.BLUE);
    g.fillRect(x + r, y, 10, 10);
  }
  private int countToDegrees(int count, int total)
  {
    double ratio = (double) count/total;
    return (int) (ratio * 360.0);
  }

  private void drawSector(Graphics g, int x, int y, int r, int fromDegree, int degrees)
  {
    if (degrees > 359)
      g.fillOval(x - r, y - r, 2 * r, 2 * r);
    else
      g.fillArc(x - r, y - r, 2 * r, 2 * r, fromDegree, degrees);
  }
}
