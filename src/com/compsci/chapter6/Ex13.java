package com.compsci.chapter6;

public class Ex13 {
	public static void main(String[] args){
		int n = 123;
		String charN = Integer.toString(n);
		String ones = charN.substring(charN.length()-1, charN.length());
		String tens = charN.substring(charN.length()-2, charN.length()-1);
		String newString = charN.substring(0,charN.length()-2) + ones + tens;
		int newInt = Integer.parseInt(newString);
		System.out.println(newInt);
	}
}
