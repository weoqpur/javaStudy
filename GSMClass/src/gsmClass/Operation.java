package gsmClass;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		// �⺻�� ������ int ����� double ������ char
//		int x, y, z;
//		x = y = z = 3;
//      System.out.println(x);
//      System.out.println(y);
//      System.out.println(z);

//		System.out.print("�ȳ�\n");
//		System.out.println("�ֵ��");
//		System.out.printf("%d",x);
//		System.out.println("�ֵ��"+"�ȳ�");
//		System.out.println("�ֵ��"+ x);
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
//      double d = sc.nextDouble();
//      float f = sc.nextFloat();
//      System.out.println("�Է¹��� ���ڴ�"+ X);
		if (X % 2 == 0) {
			System.out.println("¦�� �Դϴ�");
		} else {
			System.out.println("Ȧ�� �Դϴ�");
		}

	}

}
