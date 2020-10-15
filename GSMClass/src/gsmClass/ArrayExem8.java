package gsmClass;

public class ArrayExem8 {

	public static void main(String[] args) {
		int[] arr;
		arr = makeArray();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] makeArray() {
		int arr[] = {10, 20, 30, 40, 50};
		return arr;
	}
}