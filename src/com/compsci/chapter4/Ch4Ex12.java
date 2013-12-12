/**
 * CJ Zeiger
 * December 12th, 2013
 * Chapter 4 Exercise 12
 * Block 3B
 */
package com.compsci.chapter4;

public class Ch4Ex12 {

	public static void main(String[] args) {
		System.out.println(itProduct(5,6));
		System.out.println(recProduct(5,6));
	}
	public static int itProduct(int a, int b){
		int sum = 0;
		for(int k = 1; k <=b;k++){
			sum += a;
		}
		return sum;
	}
	public static int recProduct(int a, int b){
		if (b == 0){
			return 0;
		}
		else{
			return a + recProduct(a,b-1);
		}
	}
}
