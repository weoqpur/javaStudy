package gsmClass;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		switch(A) {
		case 1:
			System.out.println("1�� �Դϴ�");
			break;
		case 2:
			System.out.println("2�� �Դϴ�");
			break;
		case 3:
			System.out.println("3�� �Դϴ�");
			break;
		default:
			System.out.println("����Դϴ�");
		}
	}

}
