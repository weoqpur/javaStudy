package gsmClass;

public class OverLoading2 {

	public static void main(String[] args) {
		gsm("�Ҹ���", 1);
		gsm("���ּҸ���", "�ȳ�", 3);
		gsm("���ּ���Ʈ����̽��Ͱ�");
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
