package gsmClass;

public class ArrayExem6 {
	public static void main(String[] args) {
		int a[][] = { { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 1, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 } };
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
