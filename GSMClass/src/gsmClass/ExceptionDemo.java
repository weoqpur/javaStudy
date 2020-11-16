package gsmClass;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		
		int n1, n2;
		//두개의 정수를 입력받아서 몫을 구하는 알고리즘 프로그래밍
		Scanner sc = new Scanner(System.in);
		
		try {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			int a = n1 / n2;
			System.out.println("둘을 나눈 몫은: "+a);
		}catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		
		
	}
}
