package chapter4;

public class Ch4Ex14 {
	public static int count = 0;
	public static void main(String[] args) {
		someFun(5);
		System.out.println(count);
	}
	public static int someFun(int n){
		if (n <= 0){
			return 2;
		}else{
			if (n-1 == 3){
				count++;
			}
			return someFun(n-1) * someFun(n-1);
		}
	}

}
//called twice


/**
 * if someFun(4) is called:
 * 
 *  part b is Answer: E
 */
