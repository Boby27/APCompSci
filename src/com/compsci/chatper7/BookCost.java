/**
 * CJ Zeiger
 * Feb 4th, 2014
 * Chapter 7 Exercise 16 - BookCost
 * Block 3B
 */
package com.compsci.chatper7;

import java.util.Scanner;

public class BookCost {

	public static void main(String[] args) {
		System.out.println("Enter the amount of \"Be prepared\" books you want followed by the amount of \"Next Best\" books you want: \n");
		Scanner scanner = new Scanner(System.in);
		int bp = scanner.nextInt();
		System.out.println("");
		System.out.println("Now the amount of \"Next Best\" books: \n");
		int nb = scanner.nextInt();
		System.out.println("");

		System.out.println(round(getOrderTotal(bp,nb),2));
		
		
	}
	public static double getOrderTotal(int bp, int nb){
		double totalCost;
		int totalBooks = bp + nb;
		if (totalBooks == 2 && nb ==1){
			totalCost = 37.95;
		} else if (totalBooks >= 3 && totalBooks < 12){
			totalCost = totalBooks*(15.95);
		} else if (totalBooks >= 12){
			totalCost = totalBooks*(14.00);
		} else {
			totalCost = (19.95*bp) + (21.95*nb);
		}
		return totalCost;
	}
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();
	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}

}
