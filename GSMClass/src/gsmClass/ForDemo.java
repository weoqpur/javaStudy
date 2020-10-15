package gsmClass;

public class ForDemo {

	public static void main(String[] args) {
		int i, j;
		for (i = 2; i < 6; i++) {
			for (j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}
}

