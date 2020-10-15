package gsmClass;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		switch(A) {
		case 1:
			System.out.println("1등 입니다");
			break;
		case 2:
			System.out.println("2등 입니다");
			break;
		case 3:
			System.out.println("3등 입니다");
			break;
		default:
			System.out.println("등외입니다");
		}
	}

}
