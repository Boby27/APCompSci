package chapter4;

public class Ch4Ex10 {
public static int  j = 0;
	public static void main(String[] args) {
		//itPrintTri(5);
		//recPrintTri(5);
		partCRecPrintTri(5);
	}
	public static void itPrintTri(int n){
		for (int j = 1; j <= n;j++){
			printStars(j);
		}
	}
	public static void printStars(int f){
		for  (int x = 1; x <= f; x++){
			System.out.print("*");
		}
		System.out.println("");

	}
	public static void recPrintTri(int n){
		if (n >= j){
			printStars(j);
			j++;
			recPrintTri(n);
		}
		}
	public static void partCRecPrintTri(int n){
		if (n != 0){
			printStars(n);
			partCRecPrintTri(n-1);
		}
		}
	}

