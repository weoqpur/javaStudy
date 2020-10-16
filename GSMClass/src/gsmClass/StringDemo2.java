package gsmClass;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = "hello";//리터럴방식
		String s2 = "hello";
		String s3 = new String("hello");//객체생성
		String s4 = new String("hello");
		System.out.println(s1==s2);//가리키는 곳이 같음
		System.out.println(s2==s3);//변수 둘이 가르키는 곳이 다름
		System.out.println(s1.equals(s3));//내용이 같은지 비교하는 함수
	}
}
