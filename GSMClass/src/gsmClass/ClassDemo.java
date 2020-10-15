package gsmClass;

class Pizza{
	// 필드 = 클래스가 가지고 있는 변수
	String name;
	int price;
	// 메서드 = 클래스가 가지고 있는 행동
	void print() {
		System.out.println("이름 " + this.name + " 가격:" + this.price);
	}
	Pizza(){}// 생성자
	Pizza(String name, int price){
		this.name = name;
		this.price = price;
	}
	Pizza(String name) {
		//this.name = name;
		this(name, 12000);
	}
	// 필드변수와 매개변수를 구분하기 위해 this를 사용
	// this() 클래스 내부에서 나의 또다른 생성자를 호출
}

public class ClassDemo {
	
	public static void main(String[] args) {
		int i = 2;
		Pizza p1 = new Pizza();
		p1.name = "마르게리따";
		p1.price = 15000;
		p1.print();
		Pizza p2 = new Pizza();
		p2.name = "고르곤졸라";
		p2.price = 15000;
		p2.print();
		Pizza p3 = new Pizza("불고기", 15000);
		p3.print();
		System.out.println(8>>2);
		Pizza p4 = new Pizza("고구마");
		p4.print();
	}
}
