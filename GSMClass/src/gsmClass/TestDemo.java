package gsmClass;

class Vehicle{
	String color;
	int speed;
	
	Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void show() {
		System.out.println(color+","+speed);
	};
}

class Car2 extends Vehicle{
	int displacement;
	int gears;
	
	Car2(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	void show() {
		System.out.println(color+","+speed+","+displacement+","+gears);
	}
}


public class TestDemo {
	public static void main(String[] args) {
		Car2 c = new Car2("ÆÄ¶û", 200, 1000, 5);
		c.show();
		System.out.println();
		Vehicle v = c;
		v.show();
	}
}
