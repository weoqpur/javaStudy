package gsmClass;

import java.util.Scanner;

public class StringExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("player 1 �Է�");
		String s1 = sc.next();
		System.out.println("player 2 �Է�");
		String s2 = sc.next();
		if (s1.equals(s2)) {
			System.out.println("player 1" + s1);
			System.out.println("player 2" + s2);
			System.out.println("���º�");
		}
		else if ((s1.equals("��")&&s2.equals("����")) || (s1.equals("����")&&s2.equals("�ָ�")) || (s1.equals("�ָ�")&&s2.equals("��"))) {
			System.out.println("player 1" + s1);
			System.out.println("player 2" + s2);
			System.out.println("player 2 �¸�");
		}
		else {
			System.out.println("player 1" + s1);
			System.out.println("player 2" + s2);
			System.out.println("player 1 �¸�");
		}
	}
}
