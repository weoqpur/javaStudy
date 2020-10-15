package gsmClass;

class A{
	A(){
		System.out.println("생성자 A");
	}
	A(int x){
		System.out.println("오버로딩한 생성자 A" + x);
	}
}

class B extends A{
	B(){
		System.out.println("생성자 B");
	}
	B(int x){ // 생성자 오버로딩
		super(x); // 부모클래스의 생성자를 호출
		System.out.println("오버로딩한 생성자 B" + x);
	}
	
}

public class SangSokDemo3 {

	public static void main(String[] args) {
		B b = new B(5);
	}
}
