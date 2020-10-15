package gsmClass;

class Complex {
	double one, two;
	Complex (double one) {
		this.one = one;
	}
	Complex (double one, double two) {
		this.one = one;
		this.two = two;	
	}
	
	void print() {
		System.out.println(one+" + "+two+"i");
	}
}

public class ComplexTest {

	public static void main(String[] args) {
		Complex c1= new Complex(2.0);
		c1.print();
		Complex c2= new Complex(1.5, 2.5);
		c2.print();
	}
}
