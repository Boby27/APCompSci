package com.compsci.chapter6;

public class Ex18 {

	public static void main(String[] args) {
		System.out.println(convertToHumanAge(2));
	}
	public static int convertToHumanAge(int dogYears){
		return (int) (13 + ((16.0/3.0)*(dogYears-1)));
	}

}
