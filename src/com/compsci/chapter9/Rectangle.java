package com.compsci.chapter9;

public class Rectangle
{
  private int height;
  private int width;
  
  public Rectangle(int height, int widht){
    if(height>0 && widht > 0){
      this.height = height;
      this.width = widht;
    }
  }
  public Rectangle(int square){
    if(square>0){
      this.height = square;
      this.width = square;
    }
  }
  public Rectangle(){
    this.width = 1;
    this.height = 1;
  }
  public boolean isSquare(){
    return width == height;
  }
  public void quadratize(){
    int x = 1;
    boolean isGreater = false;
    while (!isGreater){
      int area = x * x;
      if (area > width*height){
       
      }
    }
    
  }
}
