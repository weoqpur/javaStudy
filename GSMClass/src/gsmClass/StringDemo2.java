package gsmClass;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = "hello";//���ͷ����
		String s2 = "hello";
		String s3 = new String("hello");//��ü����
		String s4 = new String("hello");
		System.out.println(s1==s2);//����Ű�� ���� ����
		System.out.println(s2==s3);//���� ���� ����Ű�� ���� �ٸ�
		System.out.println(s1.equals(s3));//������ ������ ���ϴ� �Լ�
	}
}
