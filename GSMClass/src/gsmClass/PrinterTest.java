package gsmClass;

class Printer {
	private int numOfPaper = 0;
	private boolean duplex;

	Printer(int num, boolean duplex) {
		numOfPaper = num;
		this.duplex = duplex;
	}

	public boolean getDuplex() {
		return duplex;
	}

	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}

	void print(int amount) {

		String dpx = (duplex == true) ? "������� " : "�ܸ����� ";
		amount = (duplex == true) ? amount / 2 + 1 : amount;

		if (amount <= numOfPaper) {
			System.out.println(dpx + amount + "�� ����߽��ϴ�. ���� " + (numOfPaper - amount) + "�� �����ֽ��ϴ�");
			numOfPaper -= amount;
		} else if (0 == numOfPaper) {
			System.out.println("������ �����ϴ�");
		} else {
			System.out.println(dpx + "��� ����Ϸ��� ���� " + (amount - numOfPaper) + "�Ű� �����մϴ�. " + numOfPaper + "�常 ����մϴ�.");
			numOfPaper = 0;
		}
	}
}

public class PrinterTest {

	public static void main(String[] args) {

		Printer p1 = new Printer(20, true);
		p1.print(25);
		p1.setDuplex(false);
		p1.print(10);
		p1.print(10);

	}
}
