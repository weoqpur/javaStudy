package gsmClass;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		double avg;
		System.out.println("���� 5���� �Է�");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		avg = (double)sum/arr.length;
		System.out.println("���� " + sum);
		System.out.println("����� " + avg);
	}

}
