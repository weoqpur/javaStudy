package Exam02;

public class Person implements MyInterface {

	@Override
	public void method() {
		System.out.println("Person 클래스의 메서드입니다.");
		
	}
	@Override
	public void Dmethod() {
		System.out.println("재정의한 default 메서드");
	}

}
