package gsmClass;

class StaticExample{
	static int[] c = new int[5];
	
	static int[] concat(int[] n, int[] m) {
		int i, j;
		for(i = 0; i < n.length; i++) {
			c[i] = n[i];
		}
		for(j = 0; j < m.length; j++) {
			c[j+3] = m[j];
		}
		return c;
	}
	
	static void print(int[] d) {
		int i;
		for(i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}
}

public class StaticDemo3 {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[2];
		arr2[0] = 100;
		arr2[1] = 200;
		int[] arr3 = StaticExample.concat(arr1, arr2);
		StaticExample.print(arr3);
	}
}
