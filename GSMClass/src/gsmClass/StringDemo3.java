package gsmClass;

class Example1{
	final static int b = 100; // final �� static�� ���� ������ ������ �Բ� �ʱ�ȭ�� �ؾ���
	
}
public class StringDemo3 {

	public static void main(String[] args) {
		Example1.b = 20;// ���� �ȵ�
		System.out.println(Example1.b);
		Example1 e = new Example1(); //��ü ����
		e.b = 30;// ���� �ȵ�
		System.out.println(e.b);
		Example1 e2 = new Example1();
		e2.b = 100;// ���� �ȵ�
		System.out.println(e.b);
		
	}
}
