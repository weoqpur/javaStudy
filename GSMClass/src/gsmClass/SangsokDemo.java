package gsmClass;

class People { // 부모 클래스 == super class
	void eat() {
		System.out.println("먹는다");
	}

	void sleep() {
		System.out.println("잔다");
	}
}

class Stu extends People { // 자식클래스 == sub class
	void study() {
		System.out.println("공부한다 열심히...");
	}

	@Override
	void sleeo() {
		System.out.println("쿨쿨 잔다");
	}
}

class Tea extends People { // 자식클래스 == sub class
	void teach() {
		System.out.println("가르친다 열심히...");
	}
}

public class SangsokDemo {
	public static void main(String[] args) {
		Stu s = new Stu();
		s.eat();
		s.sleep();
		s.study();
		Tea t = new Tea();
		t.eat();
		t.teach();

	}
}
