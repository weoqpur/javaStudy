package gsmClass;

class Pizza{
	// �ʵ� = Ŭ������ ������ �ִ� ����
	String name;
	int price;
	// �޼��� = Ŭ������ ������ �ִ� �ൿ
	void print() {
		System.out.println("�̸� " + this.name + " ����:" + this.price);
	}
	Pizza(){}// ������
	Pizza(String name, int price){
		this.name = name;
		this.price = price;
	}
	Pizza(String name) {
		//this.name = name;
		this(name, 12000);
	}
	// �ʵ庯���� �Ű������� �����ϱ� ���� this�� ���
	// this() Ŭ���� ���ο��� ���� �Ǵٸ� �����ڸ� ȣ��
}

public class ClassDemo {
	
	public static void main(String[] args) {
		int i = 2;
		Pizza p1 = new Pizza();
		p1.name = "�����Ը���";
		p1.price = 15000;
		p1.print();
		Pizza p2 = new Pizza();
		p2.name = "��������";
		p2.price = 15000;
		p2.print();
		Pizza p3 = new Pizza("�Ұ��", 15000);
		p3.print();
		System.out.println(8>>2);
		Pizza p4 = new Pizza("����");
		p4.print();
	}
}
