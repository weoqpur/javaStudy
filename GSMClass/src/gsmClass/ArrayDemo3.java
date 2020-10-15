package gsmClass;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int[][] a = new int[2][3];
		int b[][] = { { 1, 2 }, { 4, 5, 6 } };
//		System.out.println(b.length);
//		System.out.println(b[0].length);
//		System.out.println(b[1].length);
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.println(b[i][j]);
			}
		}

	}

}
