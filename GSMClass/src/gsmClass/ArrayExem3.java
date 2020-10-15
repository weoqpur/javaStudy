package gsmClass;

public class ArrayExem3 {

	public static void main(String[] args) {
		int jumsu[][] = { { 3, 5 }, { 4, 6 }, { 2, 7 } };
		int n = 0, sum = 0;
		double avg = 0;
		for(int i = 0; i < jumsu.length; i++) {
			for(int j = 0; j < jumsu[i].length; j++) {
				sum += jumsu[i][j];
			}
		}
		for(int i = 0; i < jumsu.length; i++) {
			n += jumsu[i].length;
		}
		avg = (double) sum / n;
		System.out.println(avg);
		System.out.println(sum);
	}

}
