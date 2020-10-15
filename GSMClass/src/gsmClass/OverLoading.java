package gsmClass;

public class OverLoading {

	public static void main(String[] args) {
		System.out.println("วิ:"+getSum(1, 10));
		System.out.println("วิ:"+getSum(1, 10, 100));
		System.out.println("วิ:"+getSum(1.2, 3.4));
	}
	
	public static int getSum(int a, int b) {
		return a+b;
	}
	
	public static int getSum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static double getSum(double a, double b) {
		return a+b;
	}
}
