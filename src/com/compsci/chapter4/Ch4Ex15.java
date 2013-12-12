package com.compsci.chapter4;

public class Ch4Ex15 {

	public static void main(String[] args) {
		System.out.println(biCo(2,5));
	}
	public static int biCo(int n, int k){
		if (n == k ||k == 0){
			return 1;
		}
		else{
			return biCo(n-1,k-1) + biCo(n-1,k);	
		}
	}
}
