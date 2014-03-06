package com.compsci.chapter8;

public class Ch8Ex16 {
	private static int p;
	private static int n;
	private static int d;
	private static int q;
	private static int count;
	
	
	public static void main (String[] args){
		int cents = 100000;
		p = cents;
		n = cents/5;
		d = cents /10;
		q = cents/25;
		allCombinations(p,n,d,q,cents);
		System.out.println(""+count);
	}
	private static void allCombinations(int p, int n, int d, int q,int cents){
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
	private static void printCoins(int pen, int nic, int dime, int qut, int cent){
		//System.out.println(""+cent+" = " + qut + " quarters + " + dime + " dimes + " + nic + " nickels + " + pen + " pennies");
		count++;
	}
}
