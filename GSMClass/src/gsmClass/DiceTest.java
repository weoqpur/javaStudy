package gsmClass;

class Dice {
	int roll() {
		return (int) (Math.random() * 6) + 1;
	}
}

public class DiceTest {

	public static void main(String[] args) {
		Dice d = new Dice();
		System.out.println("�ֻ����� ���� : " + d.roll());

	}
}
