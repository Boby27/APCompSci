package com.compsci.chapter8;

public class Ch8Ex16 {
	private static int count;
	private static int cents = 30;
	private static int mp;
	private static int mn;
	private static int md;
	private static int mq;
	
	public static void main (String[] args){
		mp = cents;
		mn = cents/5;
		md = cents /10;
		mq = cents/25;
		allCombinations(mp,mn,md,mq);
		System.out.println(""+count);
	}
	private static void allCombinations(int p, int n, int d, int q){
		if (p+(n*5)+(d*10)+(q*25)==cents){
			printCoins(p,n,d,q,cents);
		}
		for (int ip = p; ip>=0; ip--){
			
		}
	}
	private static void printCoins(int pen, int nic, int dime, int qut, int cent){
		System.out.println(""+cent+" = " + qut + " quarters + " + dime + " dimes + " + nic + " nickels + " + pen + " pennies");
		count++;
	}
}
