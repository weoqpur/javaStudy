package gsmClass;

// �߻�Ŭ���� & �߻�޼���
abstract class Computer {
	// �߻�Ŭ����: �߻�޼��带 ������ Ŭ����
	// �߻�޼���: �ٵ� �������� ���� �޼���
	void turnOn() {
		System.out.println("���� ON");
	}

	void turnOff() {
		System.out.println("���� OFF");
	}

	abstract void display();// �߻�޼���
							// �ڽ�Ŭ�������� ������ ����
	void show() {
		turnOn();
		display();
		turnOff();
	}
}

class Notebook extends Computer {
	void display() {
		System.out.println("Notebook display");
	}
}
class Desktop extends Computer {
	void display() {
		System.out.println("Desktop display");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Computer [] c = {new Notebook(), new Desktop()};
		for(Computer i: c) {
			i.show();
		}
	}
}
