package gsmClass;

class A{
	A(){
		System.out.println("������ A");
	}
	A(int x){
		System.out.println("�����ε��� ������ A" + x);
	}
}

class B extends A{
	B(){
		System.out.println("������ B");
	}
	B(int x){ // ������ �����ε�
		super(x); // �θ�Ŭ������ �����ڸ� ȣ��
		System.out.println("�����ε��� ������ B" + x);
	}
	
}

public class SangSokDemo3 {

	public static void main(String[] args) {
		B b = new B(5);
	}
}
