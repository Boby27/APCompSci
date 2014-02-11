/**
 * CJ Zeiger
 * Feb 4th, 2014
 * Chapter 7 Exercise 17
 * Block 3B
 */

package com.compsci.chapter7;

import java.awt.Color;

public class Ch7Ex17 {

	public static void main(String[] args) {

	}
	public Color bestMatch(int r, int g, int b){
		Color color = null;
		if (r == g && r == b){
			color = Color.GRAY;
		} else if (r == g && r > b){
			color = Color.YELLOW;
		} else if (r == b && r > g){
			color = Color.MAGENTA;
		} else if (b==g && b > r){
			color = Color.CYAN;
		} else if (r > b && r > g){
			color = Color.RED;
		} else if (b > r && b > g){
			color = Color.BLUE;
		} else if (g > b && g > b){
			color = Color.GREEN;
		}
		return color;
	}

}
