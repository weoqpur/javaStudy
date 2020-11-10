package Exam03;

public class PersonEx {

	public static void main(String[] args) {
		Parent parent = new Parent() {
			String str = "야옹";
			public void method2() {
				System.out.println("익명 자손  객체");
			}
			//익명 자손 객체 생성 예정
			@Override
			public void method() {
				this.method2();
				System.out.println("고양이: " + this.str);
			}
		};
		parent.method();

	}

}
