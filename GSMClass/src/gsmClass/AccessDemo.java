package gsmClass;

class AccassEx {
	public int a;
	private int b;
	int c;
	protected int d;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}

public class AccessDemo {
	public static void main(String[] args) {
		AccassEx p = new AccassEx();
		p.a = 20;
		p.setB(30);
		p.c = 40;
		p.d = 50;
	}
}
