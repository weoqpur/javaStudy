package gsmClass;

class Example1{
	final static int b = 100; // final 과 static을 같이 쓰려면 생성과 함께 초기화를 해야함
	
}
public class StringDemo3 {

	public static void main(String[] args) {
		Example1.b = 20;// 이제 안됨
		System.out.println(Example1.b);
		Example1 e = new Example1(); //객체 생성
		e.b = 30;// 이제 안됨
		System.out.println(e.b);
		Example1 e2 = new Example1();
		e2.b = 100;// 이제 안됨
		System.out.println(e.b);
		
	}
}
