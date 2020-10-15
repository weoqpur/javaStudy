package gsmClass;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		// 기본형 정수형 int 상수형 double 문자형 char
//		int x, y, z;
//		x = y = z = 3;
//      System.out.println(x);
//      System.out.println(y);
//      System.out.println(z);

//		System.out.print("안녕\n");
//		System.out.println("애들아");
//		System.out.printf("%d",x);
//		System.out.println("애들아"+"안녕");
//		System.out.println("애들아"+ x);
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
//      double d = sc.nextDouble();
//      float f = sc.nextFloat();
//      System.out.println("입력받은 숫자는"+ X);
		if (X % 2 == 0) {
			System.out.println("짝수 입니다");
		} else {
			System.out.println("홀수 입니다");
		}

	}

}
