package a1111;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Character> a = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("빈 칸으로 분리하여 5 개의 학점을 입력(A/B/C/D/F)>>");
		for (int i = 0; i < 5; i++) {
			String s = sc.next();
			if(s.length() > 1) {
				System.out.println("Not character");
				sc.close();
				return;
			}
			char ch = s.charAt(0);
			if ((ch >= 'A' && ch <= 'D') || ch == 'F')
				a.add(ch);
			else {
				System.out.println("Invalid");
				sc.close();
				return;
			}
		}
		for(Character j : a) {
			switch (j) {
			case 'A':
				System.out.println("4.0 ");
				break;
			case 'B':
				System.out.println("3.0 ");
				break;
			case 'C':
				System.out.println("2.0 ");
				break;
			case 'D':
				System.out.println("1.0 ");
				break;
			case 'F':
				System.out.println("0.0 ");				
				break;
			}
		}
		sc.close();
	}

}
