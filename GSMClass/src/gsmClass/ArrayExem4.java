package gsmClass;

import java.util.Scanner;

public class ArrayExem4 {

	public static void main(String[] args) {
		int num[] = new int[10];
		int i, count = 0;
		Scanner sc = new Scanner(System.in);
		for(i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if(num[i] % 3 == 0)
				count++;
		}
		System.out.println(count);
	}

}
