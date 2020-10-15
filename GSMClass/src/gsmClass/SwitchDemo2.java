package gsmClass;

public class SwitchDemo2 {

	public static void main(String[] args) {
		String s = "even";
		
		switch (s) {
		case "even":
			System.out.println("짝수 입니다");
			break;
		case "odd":
			System.out.println("홀수 입니다");
			break;
		default:
			System.out.println("둘다 아닙니다");
			break;
		}
 	}

}
