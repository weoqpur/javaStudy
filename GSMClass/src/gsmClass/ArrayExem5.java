package gsmClass;

import java.util.Scanner;

public class ArrayExem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int unit[] = {50000, 10000, 1000, 100, 10, 1};
		System.out.println("금액입력>>");
		int money  = sc.nextInt();
		
		for( i = 0; i < unit.length; i++) {
			
			System.out.println(unit[i] + ":" + money/unit[i]);
			money = money - (money/unit[i]) * unit[i];
		}
	}

}
