package gsmClass;

class Phone {
	String company;
	int version;
	String phone;

	Phone(){}
	
	Phone(String company, int version, String phone) {
		this.company = company;
		this.version = version;
		this.phone = phone;
	}

	void print() {
		System.out.println(company + "ÀÇ " + version + "¼¼´ë " + phone);
	}
}

public class ClassDemo3 {

	public static void main(String[] args) {
		Phone myPhone = new Phone("apple", 8, "iphone");
		myPhone.print();

	}
}
