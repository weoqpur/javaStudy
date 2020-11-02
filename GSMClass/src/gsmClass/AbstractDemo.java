package gsmClass;

// 추상클래스 & 추상메서드
abstract class Computer {
	// 추상클래스: 추상메서드를 포함한 클래스
	// 추상메서드: 바디가 구현되지 않은 메서드
	void turnOn() {
		System.out.println("전원 ON");
	}

	void turnOff() {
		System.out.println("전원 OFF");
	}

	abstract void display();// 추상메서드
							// 자식클래스에게 구현을 위임
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
