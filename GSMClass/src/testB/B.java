package testB;

import testA.A;

public class B {
	public static void main(String[] args) {
		A a = new A();
		a.f();
		System.out.println(a.n);
	}
}
