package gsmClass;

class SuperC{
	SuperC(String s) {
		System.out.println("super");
		System.out.println(s);
	}
}

class SubC extends SuperC{
	SubC(){
		super("s");
		System.out.println("sub");
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		
		SubC s = new SubC();
	}
}
