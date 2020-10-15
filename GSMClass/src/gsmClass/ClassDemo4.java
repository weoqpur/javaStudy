package gsmClass;

class Person {
	
	String school;
	int age;
	String name;
	
	Person(String school, int age, String name) {
		
		this.school = school;
		this.age = age;
		this.name = name;
	}
	
	Person(int age, String name) {
		
		this("gsm", age, name);
	}
	
	void infoPrint() {
		
		System.out.println(school + "´Ù´Ï´Â " + age + "»ì " + name);
	}
}

public class ClassDemo4 {

	public static void main(String[] args) {
		
		Person p1 = new Person("gsm", 17, "À±Àç¹Î");
		p1.infoPrint();
		Person p2 = new Person(18, "Á¤´ë¿ì");
		p2.infoPrint();
	}
}
