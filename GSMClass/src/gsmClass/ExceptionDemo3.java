package gsmClass;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		int n = 10;
		try {
			int n2 = Integer.parseInt(args[0]);
			System.out.println(n / n2);
			
		} catch (ArithmeticException e) {
			System.out.println(n/1);
			System.out.println(e);
			System.out.println("0���� ���� �� ����");
		} catch (NumberFormatException e) {
			System.out.println(e);
			System.out.println("����ε� ������ �Է��ϼ���.");
		}
	}
}
