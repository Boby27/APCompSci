package com.compsci.chapter10;

public class PacketTester
{

  public static void main(String[] args)
  {
    PacketTester test = new PacketTester();
  }
  public PacketTester(){
    p45();
  }
  private void pt(String s){
    System.out.println(s);
  }
  private int m6(String str){
    int count = 0;
    for (int i=0; i <str.length()-1;i++){
      String s1 = str.substring(i,i+1);
      String s2 = str.substring(i+1,i+2);
      if(!s1.equals(s2)){
        count++;
      }
    }
    return count;
  }
  private void p45(){
    pt(phoneNumber("555-666-777"));
    pt(phoneNumber("888.333.4444"));
    
  }
  private String phoneNumber(String s){
    if(s.contains("-")){
      return s.replace("-",".");
    } else {
      return s.replace(".","-");
    }
    
  }
}
