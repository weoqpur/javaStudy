package gsmClass;

class Line {
	int i;

	Line(int i) {
		this.i = i;
	}

	boolean isSameLine(Line k) {
		boolean i = this.i == k.i?true: false;
		return i;
	}
}

public class LineTest {

	public static void main(String[] args) {
		Line a = new Line(1);
		Line b = new Line(1);

		System.out.println(a.isSameLine(b));
		System.out.println(a == b);

	}
}
