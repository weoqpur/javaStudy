package gsmClass;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("player 1 ÀÔ·Â");
		String s1 = sc.next();
		System.out.println("player 2 ÀÔ·Â");
		String s2 = sc.next();
		if (s1.equals(s2)) {
			System.out.println("player 1" + s1);
			System.out.println("player 2" + s2);
			System.out.println("¹«½ÂºÎ");
		}
		else if ((s1.equals("º¸")&&s2.equals("°¡À§")) || (s1.equals("°¡À§")&&s2.equals("ÁÖ¸Ô")) || (s1.equals("ÁÖ¸Ô")&&s2.equals("º¸"))) {
			System.out.println("player 1" + s1);
			System.out.println("player 2" + s2);
			System.out.println("player 2 ½Â¸®");
		}
		else {
			System.out.println("player 1" + s1);
			System.out.println("player 2" + s2);
			System.out.println("player 1 ½Â¸®");
		}
	}
}
