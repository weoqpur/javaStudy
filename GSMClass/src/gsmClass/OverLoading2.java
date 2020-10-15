package gsmClass;

public class OverLoading2 {

	public static void main(String[] args) {
		gsm("소마고", 1);
		gsm("광주소마고", "안녕", 3);
		gsm("광주소프트웨어마이스터고");
	}
	
	public static void gsm(String a, int b) {
		System.out.println(a+b);
	}
	
	public static void gsm(String a, String b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void gsm(String a) {
		System.out.println(a);
	}
}
