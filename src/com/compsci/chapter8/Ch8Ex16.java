package com.compsci.chapter8;
/**
 * CJ Zeiger
 * Feb 24th, 2014
 * Chapter 8 Exercise 16
 * Block 3B
 */
public class Ch8Ex16 {
	private int p;
	private int n;
	private int d;
	private int q;
	private int count;
	
	
	public static void main (String[] args){
		Ch8Ex16 run = new Ch8Ex16();
	}
	Ch8Ex16(){
	  int cents = 30;
    p = cents;
    n = cents/5;
    d = cents /10;
    q = cents/25;
    allCombinations(p,n,d,q,cents);
    System.out.println(""+count);
	}
	private void allCombinations(int p, int n, int d, int q,int cents){
		for (int i = 0;i<=p;i++){
			for (int j = 0;j<=n;j++){
				for (int k = 0;k<=d;k++){
					for (int l = 0;l<=q;l++){
						if(i+(j*5)+(k*10)+(l*25)==cents){
							printCoins(i,j,k,l,cents);
						}
					}
				}
			}
		}
	}

	private void printCoins(int pen, int nic, int dime, int qut, int cent){
		System.out.println(""+cent+" = " + qut + " quarters + " + dime + " dimes + " + nic + " nickels + " + pen + " pennies");
		count++;
	}
}
