package gsmClass;

class School extends Object{
	String name;
	School(String name) {
		this.name = name;
	}
	public String toString() {
		return "�츮�б��� " + name;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		School s = new School("GSM");
		System.out.println(s);

	}

}
