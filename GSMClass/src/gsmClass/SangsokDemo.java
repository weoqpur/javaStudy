package gsmClass;

class People { // �θ� Ŭ���� == super class
	void eat() {
		System.out.println("�Դ´�");
	}

	void sleep() {
		System.out.println("�ܴ�");
	}
}

class Stu extends People { // �ڽ�Ŭ���� == sub class
	void study() {
		System.out.println("�����Ѵ� ������...");
	}

	@Override
	void sleeo() {
		System.out.println("���� �ܴ�");
	}
}

class Tea extends People { // �ڽ�Ŭ���� == sub class
	void teach() {
		System.out.println("����ģ�� ������...");
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
