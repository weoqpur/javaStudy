package gsmClass;

class Circle{
	int radius;
	
	void show() {
		System.out.println("�������� " + radius + "�� ���̴�.");
	}
	Circle(int radius){
		this.radius = radius;
	}
}

class ColoredCircle extends Circle{
	String color;
	
	void show() {
		System.out.println("�������� " + radius + "�� " + color + " ���̴�.");
	}
	ColoredCircle(int radius, String color){
		super(radius);
		this.color = color;
	}
}

public class SangSokTest {

	public static void main(String[] args) {
		Circle b = new Circle(5);
		b.show();
		ColoredCircle c = new ColoredCircle(10, "������");
		c.show();
		
	}
}
