package chapter4;

public class Ch4Ex13 {

	public static void main(String[] args) {
		System.out.println(goldenRatio(20));
	}
	public static double goldenRatio(int n ){
		if (n == 1){
			return 1.0;
		}
		else{;
			return 1.0 + 1.0/goldenRatio(n-1);
		}
	}

}
