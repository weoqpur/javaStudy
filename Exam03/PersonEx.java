package Exam03;

public class PersonEx {

	public static void main(String[] args) {
		Parent parent = new Parent() {
			String str = "�߿�";
			public void method2() {
				System.out.println("�͸� �ڼ�  ��ü");
			}
			//�͸� �ڼ� ��ü ���� ����
			@Override
			public void method() {
				this.method2();
				System.out.println("�����: " + this.str);
			}
		};
		parent.method();

	}

}
