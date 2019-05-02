
public class RecursiveFunctions {
	public static int factorial(int n) {
		int msg=0;
		if(n==0) {
			msg=1;
		}else {
			msg=n*factorial(n-1);
		}
		return msg;
	}
	public static int fibonacci(int n) {
		int msg=0;
		if(n==0) {
			msg=0;
		}else if(n==1) {
			msg=1;
		}else {
			msg=fibonacci(n-1)+fibonacci(n-2);
		}
		return msg;
	}
	public static int arraySummatory(int[] n, int pos) {
		int msg=0;
		int l=n.length-1;
		if(pos==0) {
			msg=+n[0];
		}else {
			msg=n[pos]+arraySummatory(n, pos-1);
		}
		return msg;
	}
}	
