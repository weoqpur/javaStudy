package Exam02;

public interface MyInterface{
	int MAX = 100;
	
	void method();
	default void Dmethod() {
		System.out.println("�������̽��� default �޼��� �Դϴ�.");
	}
	static void Smethod() {
		System.out.println("�������̽��� static �޼��� �Դϴ�.");
	}
	
	
}
