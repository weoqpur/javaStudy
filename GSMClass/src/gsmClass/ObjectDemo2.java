package gsmClass;

class Square{
	int width, height;
	Square(int width, int height) {
		this.height = height;
		this.width = width;
	}
	public boolean equals(Object obj) {
		return (this.height * this.width == ((Square)obj).height * ((Square)obj).width);
	}
}

public class ObjectDemo2 {

	public static void main(String[] args) {
		Square s1 = new Square(3, 4);
		Square s2 = new Square(3, 4);
		System.out.println(s1.equals(s2));

	}

}
