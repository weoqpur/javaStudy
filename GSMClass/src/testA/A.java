package testA;

public class A {
	// 멤버 (필드, 메서드)
	// 접근 지정자
	// 1. public 패키지 상관x
	// 2. private 같은 클래스 내에서만 접근 가능
	// 3. protected 같은 패키지 접근 o 상속받은 자식 o
	// 4. default 같은 패키지 내에서 접근 가능
	int n;

	void f() {
		this.n = 100;
	}

//	public static void main(String[] args) {
//		A a = new A();
//		a.f();
//		System.out.println(a.n);
//	}
}
