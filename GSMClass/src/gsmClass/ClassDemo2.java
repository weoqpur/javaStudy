package gsmClass;

import java.util.Scanner;

class Square {
	int width, height;
	int getArea() {
		return width * height;
	}
}

public class ClassDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Square p1 = new Square();
		p1.width = sc.nextInt();
		p1.height = sc.nextInt();
		System.out.println("³ÐÀÌ´Â:"+ p1.getArea());
	}
}

