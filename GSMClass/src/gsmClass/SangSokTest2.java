package gsmClass;

class Person1 {
	private int age;
	private String name;
	Person1(String name, int age){
		this.setName(name);
		this.setAge(age);
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
}

class Student extends Person1{
	private int num;
	Student(String name, int age, int num) {
		super(name, age);
		this.setNum(num);
	}
	int getNum() {
		return num;
	}
	void setNum(int num) {
		this.num = num;
	}
}

class ForeignStudent extends Student{
	private String a;
	ForeignStudent(String name, int age, int num, String a) {
		super(name, age, num);
		this.setA(a);
	}
	String getA() {
		return a;
	}
	void setA(String a) {
		this.a = a;
	}
}

public class SangSokTest2 {

	public static void main(String[] args) {
		
	}
}
