package Chapter4;
public class Ch4Ex6 {
public final static double ratio = (1+Math.sqrt(5))/2;	
	public static void main(String[] args){
		/**
		 *   The numerator of the next term is the sum of num and denom of the previous 
		 *   the denom of the next term is the num of the previous
		 */
		int x = 9;
		int n = 1;
		int d = 1;
		for(int j = 1 ;j<x;j++){
			int oldd = d;
			d = n;
			n = n + oldd;
				
		}
		System.out.println("X - sub " + x );
		System.out.println(n);
		System.out.println("--");
		System.out.println(d);
		bestApprox();
		
	}
	public static void bestApprox(){
		int x = 9;
		int n = 1;
		int d = 1;
		int diff= 10;
		String bestFraction="null";
		
		for(int j = 1 ;j<x;j++){
			int oldd = d;
			d = n;
			n = n + oldd;
			if (Math.abs((n/d)-ratio) < diff){
				bestFraction = "The fraction with a denominator less that 50 that best approximates the golden ration is: "+ n+ "/"+d;
			}
		}
		System.out.println(bestFraction);
	}

}
