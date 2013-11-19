package chapter4;

public class Ch4Ex9 {

	public static void main(String[] args) {
		System.out.println(mysterySum(5));
	}
	public static int mysterySum(int n){
		if (n==0){
			return 0;
		}
		else
			return 3 + mysterySum(n-1);
	}

}//Output is 15