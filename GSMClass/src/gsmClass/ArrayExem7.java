package gsmClass;

public class ArrayExem7 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30 };
		plusTen(arr);
	}

	public static void plusTen(int[] ten) {
		for (int i = 0; i < ten.length; i++) {
			ten[i] += 10;
			System.out.println(ten[i]);
		}
	}
}
