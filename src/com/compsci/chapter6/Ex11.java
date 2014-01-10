package com.compsci.chapter6;

public class Ex11 {

	public static void main(String[] args) {
		double a = 3, b = 10, c = 6;
		if ((b*b)-(4*a*c) < 0)
			System.out.println("Neg under des");
		else{
		double descriminate = Math.sqrt((b*b)-(4*a*c));
		double x1 = (-b + descriminate)/(2*a);
		double x2 = (-b - descriminate)/(2*a);
		System.out.println("X1: "+ x1 + " X2: " + x2);
		}
		
	}

}
