package gsmClass;

public class WhileDemo2 {

	public static void main(String[] args) {
		int i = 0;
		while (i < 101) {
			i++;
			if (i % 7 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}