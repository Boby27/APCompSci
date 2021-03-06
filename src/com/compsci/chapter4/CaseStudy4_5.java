/**
 * CJ Zeiger
 * Euclid GCF program
 * Block 3B
 */
package com.compsci.chapter4;
import java.util.Scanner;
public class CaseStudy4_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 15;
		int b = 80;
		System.out.println(iterative(a,b));
		System.out.println(recursive(a,b));
	}
	public static int iterative(int a, int b){
		while (a!=b){
			if (a>b){
				a-=b;
			}
			else{
				b-=a;
			}
		}
		return a;
	}
	public static int recursive(int a, int b){
		if (a==b){
			return a;
		}
		if (a>b){
			return recursive(a-b,b);
		}
		else{
			return recursive(a, b-a);
		}
	}

}
