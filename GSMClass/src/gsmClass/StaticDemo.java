package gsmClass;

class StaticEx {
	//인스턴스 맴버
	int x;
	void f1() {
		this.x = 10;
	}
	//클래스 맴버
	static int y;
	static void f2() {
		y = 30;
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		StaticEx.f2();
		System.out.println(StaticEx.y);

		StaticEx s1 = new StaticEx();
		s1.x = 100;
		System.out.println(s1.x);
		s1.f1();
		System.out.println(s1.x);
		s1.y = 100;
		System.out.println(s1.y);
		s1.f2();
		System.out.println(s1.y);
		StaticEx s2 = new StaticEx();
		s2.y = 100;
		System.out.println(s2.y);
		s2.f2();
		System.out.println(s2.y);
		s2.y = 1000000;
		System.out.println(s2.y);
		System.out.println(s1.y);
		
	}
}
