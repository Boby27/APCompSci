package com.compsci.chapter8;

public class Ch8Ex11 {
	public static void main(String[] args) {
		printStarTriangle(8);
	}
	private static void printStarTriangle(int n){
		for(int i = 1; i<=n;i++){
			for(int j=1;j<=(n-i);j++){
				System.out.print(" ");
			}
			for(int k = (i*2)-1; k>0;k--){ 
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
