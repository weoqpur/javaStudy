package Exam03;

public class SoundEx {
	
	public static void main(String[] args) {
		
		Soundable soundable = new Soundable() {
			//���������δ� Ŭ�����̱� ������ �ɹ��� �޼��带 ������ �� �ִ�
			//�ܺο��� ������ �Ұ���. �ٺ��� ������
			int a = 100;
			public void method() {
				System.out.println("�͸� ���� ��ü");
			}
			@Override
			public void sound(int volume) {
				this.a = volume;
				String str = "nyan";
				System.out.println("�����: " + str);
				this.method();
				System.out.println(this.a);
			}
		};//������� ���� ��ü
		soundable.sound(10);
		Soundable soundable1 = new Soundable() {
			//���������δ� Ŭ�����̱� ������ �ɹ��� �޼��带 ������ �� �ִ�
			//�ܺο��� ������ �Ұ���. �ٺ��� ������
			int a = 100;
			public void method() {
				System.out.println("�͸� ���� ��ü");
			}
			@Override
			public void sound(int volume) {
				this.a = volume;
				String str = "wall";
				System.out.println("������: " + str);
				this.method();
				System.out.println(this.a);
			}
		};
		soundable1.sound(10);
	}
}
