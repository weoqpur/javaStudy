package gsmClass;

public class WrapperDemo {

	public static void main(String[] args) {
		// �⺻Ÿ�� int
		Integer i = new Integer(10);// �ڽ�
		Integer i2 = Integer.valueOf(5); // �ڽ�
		System.out.println(i);
		System.out.println(i2);
		Integer i3 = 20; // �ڵ� �ڽ�
		System.out.println(i3);
		int i4 = i2.intValue(); // ��ڽ�
		System.out.println(i4);
		int i5 = i3; //�ڵ� ��ڽ�
		System.out.println(i5);
		
		String s = Double.toString(3.14); // double�� String������
		System.out.println(s);
		Double d2 = Double.parseDouble("3.14");
		System.out.println(d2);
	}
}
