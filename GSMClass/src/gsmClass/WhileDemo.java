package gsmClass;

public class WhileDemo {

	public static void main(String[] args) {
		int i = 1, sum = 0;
		while (i < 101) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}

}
