package Exam02;

public class PersonEx {

	public static void main(String[] args) {
		MyInterface myInterface = new Person();
		myInterface.method();
		myInterface.Dmethod();
		System.out.println(MyInterface.MAX);
		MyInterface.Smethod();
		
	}
}
