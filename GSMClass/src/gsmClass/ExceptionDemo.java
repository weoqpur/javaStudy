package gsmClass;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		
		int n1, n2;
		//�ΰ��� ������ �Է¹޾Ƽ� ���� ���ϴ� �˰��� ���α׷���
		Scanner sc = new Scanner(System.in);
		
		try {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			int a = n1 / n2;
			System.out.println("���� ���� ����: "+a);
		}catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		
		
	}
}
