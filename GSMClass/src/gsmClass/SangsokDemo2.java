package gsmClass;

class Animals{
	void eat() {
		System.out.println("�Դ´�");
	}
	void bark() {
		System.out.println("¢�´�");
	}
}

class Cat extends Animals{
	@Override
	void bark() {
		System.out.println("����");
	}
	
}

class Dog extends Animals{
	@Override
	void bark() {
		System.out.println("��");
	}
	// �������̵��� �Ұ����� ���
	// 1. �θ� �޼����� ���������ڰ� private
	// 2. static
	// 3. final Ŭ������ ������ ����� �ȵǴ� Ŭ������ ��
}

public class SangsokDemo2 {

	public static void main(String[] args) {
		//final ��� ���� �Ҷ� ����
		Cat c = new Cat();
		c.eat();
		c.bark();
		Dog d = new Dog();
		d.bark();
		
	}

}
