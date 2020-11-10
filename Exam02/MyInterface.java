package Exam02;

public interface MyInterface{
	int MAX = 100;
	
	void method();
	default void Dmethod() {
		System.out.println("인터페이스의 default 메서드 입니다.");
	}
	static void Smethod() {
		System.out.println("인터페이스의 static 메서드 입니다.");
	}
	
	
}
