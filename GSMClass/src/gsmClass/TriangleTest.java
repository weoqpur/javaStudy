package gsmClass;

class Triangle {
	double l, h;
	Triangle(double l, double h) {
		this.l = l;
		this.h = h;
	}
	
	double findArea() {
		return l * h / 2;
	}
	
	boolean isSameArea(Triangle t) {
		boolean i = (this.l * this.h == t.l * t.h)? true : false ;
		return i;
	}
}

public class TriangleTest {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));

	}
}
