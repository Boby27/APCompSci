/**
 * CJ Zeiger
 * Feb 4th, 2014
 * Chapter 7 Exercise 18
 * Block 3B
 */


package com.compsci.chatper7;

public class Ch7Ex18 {

	public static void main(String[] args) {
	}
	public int findBestFit(int size1, int size2, int space){
		int result = 0;
		int combinationSize = size1+size2;
		if (combinationSize == space){
			return 3;
		} else if (combinationSize > space && size1 > size2) {
			result = 1;
		} else if (combinationSize > space && size2 < size2){
			result = 2;
		} else if (size1 == size2 && size1 <= space){
			result = 1;
		} else if (size1 > space && size2 > space){
			result = 0;
		}
		return result;
	}

}
