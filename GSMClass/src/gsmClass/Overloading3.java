package gsmClass;

import java.util.Scanner;

public class Overloading3 {

	public static void main(String[] args) {
		int result;
		int n;
		Scanner sc = new Scanner(System.in);

		// n = sc.nextInt();

		// result = factorial(n);

		// System.out.println(result);

		System.out.println(factorial(16));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}

	static int factorial(int x) {
		int r = 1;
		while (x != 0) {
			r *= x;
			x--;
		}
		return r;

	}

	static int factorial(int x, int y) {
		int r = 1;
		while (x <= y) {
			r *= y;
			y--;
		}
		return r;
	}
}
