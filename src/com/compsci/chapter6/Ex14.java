package com.compsci.chapter6;

public class Ex14 {

	public static void main(String[] args) {
		int dayOfWeek1 = 5;
		int day = 18;
		
		while (day > dayOfWeek1){
			day -= 7;
		}
		int dayOfTheWeek = dayOfWeek1 - day;
		System.out.println(dayOfTheWeek);
	}

}
