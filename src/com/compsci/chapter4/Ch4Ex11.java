/**
 * CJ Zeiger
 * December 12th, 2013
 * Chapter 4 Exercise 11
 * Block 3B
 */
package com.compsci.chapter4;

public class Ch4Ex11 {
	public static int count = 0;
	public static void main(String[] args) {
		System.out.println(power3(15));
		System.out.println(count);
	}
	public static int power3(int n){
		if (n==0){
			return 1;
		}
		else{
			int p = power3(n/2);
			p *= p;
			count++;
			if (n % 2 == 1){
				p *=3;
				count++;
			}
			return p;
		}
	}
}
