package gsmClass;

public class MethodDemo {

	public static void main(String[] args) {

		System.out.println("1���� 10������ ���� " + sum(1, 10));


	}
	
	public static int sum(int a, int b) {
		int i, sum = 0;
		for (i = a; i < b + 1; i++) {
			sum += i;
		}
		return sum;
	}
}
