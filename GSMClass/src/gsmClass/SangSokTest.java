package gsmClass;

class Circle{
	int radius;
	
	void show() {
		System.out.println("반지름이 " + radius + "인 원이다.");
	}
	Circle(int radius){
		this.radius = radius;
	}
}

class ColoredCircle extends Circle{
	String color;
	
	void show() {
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
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
		ColoredCircle c = new ColoredCircle(10, "빨간색");
		c.show();
		
	}
}
