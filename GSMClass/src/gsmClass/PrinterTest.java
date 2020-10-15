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

		String dpx = (duplex == true) ? "양면으로 " : "단면으로 ";
		amount = (duplex == true) ? amount / 2 + 1 : amount;

		if (amount <= numOfPaper) {
			System.out.println(dpx + amount + "장 출력했습니다. 현재 " + (numOfPaper - amount) + "장 남아있습니다");
			numOfPaper -= amount;
		} else if (0 == numOfPaper) {
			System.out.println("용지가 없습니다");
		} else {
			System.out.println(dpx + "모두 출력하려면 용지 " + (amount - numOfPaper) + "매가 부족합니다. " + numOfPaper + "장만 출력합니다.");
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
