/**
 * CJ Zeiger
 * December 12th, 2013
 * Chapter 4 Exercise 13
 * Block 3B
 */
package com.compsci.chapter4;

public class Ch4Ex13 {

	public static void main(String[] args) {
		System.out.println(goldenRatio(20));
	}
	public static double goldenRatio(int n ){
		if (n == 1){
			return 1.0;
		}
		else{;
			return 1.0 + 1.0/goldenRatio(n-1);
		}
	}

}
