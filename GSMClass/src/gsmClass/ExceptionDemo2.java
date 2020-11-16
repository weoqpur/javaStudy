package gsmClass;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		int []arr = new int[5];
		
		Scanner sc = new Scanner(System.in);

		try {
			for(int i = 0 ; i < arr.length ; i++)
				arr[i] = sc.nextInt();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("범위에 맞게 입력하세요");
		}
//		finally {
//			System.out.println("무조건실행");
//		}

	}

}
