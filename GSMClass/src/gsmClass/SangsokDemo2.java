package gsmClass;

class Animals{
	void eat() {
		System.out.println("먹는다");
	}
	void bark() {
		System.out.println("짖는다");
	}
}

class Cat extends Animals{
	@Override
	void bark() {
		System.out.println("어흥");
	}
	
}

class Dog extends Animals{
	@Override
	void bark() {
		System.out.println("멍");
	}
	// 오버라이딩이 불가능한 경우
	// 1. 부모 메서드의 접근지정자가 private
	// 2. static
	// 3. final 클래스에 붙히면 상속이 안되는 클래스가 됌
}

public class SangsokDemo2 {

	public static void main(String[] args) {
		//final 상수 선언 할때 쓰임
		Cat c = new Cat();
		c.eat();
		c.bark();
		Dog d = new Dog();
		d.bark();
		
	}

}
