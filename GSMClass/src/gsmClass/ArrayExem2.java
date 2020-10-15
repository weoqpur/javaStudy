package gsmClass;

import java.util.Scanner;

public class ArrayExem2 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("ÃÖ´ñ°ªÀº " + max);
	}

}
