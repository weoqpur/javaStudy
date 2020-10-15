package gsmClass;

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void print() {
		System.out.println("xÁÂÇ¥, yÁÂÇ¥:" + x + "," + y);
	}
}

class ColorPoint extends Point {
	String color;

	ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	void print() {
		super.print();
		System.out.println("»ö±òÀº"+color);
	}
}

public class SangSokDemo4 {

	public static void main(String[] args) {
		ColorPoint c = new ColorPoint(3, 4, "blue");
		c.print();
		
	}

}
