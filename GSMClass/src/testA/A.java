package testA;

public class A {
	// ��� (�ʵ�, �޼���)
	// ���� ������
	// 1. public ��Ű�� ���x
	// 2. private ���� Ŭ���� �������� ���� ����
	// 3. protected ���� ��Ű�� ���� o ��ӹ��� �ڽ� o
	// 4. default ���� ��Ű�� ������ ���� ����
	int n;

	void f() {
		this.n = 100;
	}

//	public static void main(String[] args) {
//		A a = new A();
//		a.f();
//		System.out.println(a.n);
//	}
}
