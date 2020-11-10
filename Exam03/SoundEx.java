package Exam03;

public class SoundEx {
	
	public static void main(String[] args) {
		
		Soundable soundable = new Soundable() {
			//내부적으로는 클래스이기 때문에 맴버와 메서드를 생성할 수 있다
			//외부에서 접근은 불가능. 근본이 사운더블
			int a = 100;
			public void method() {
				System.out.println("익명 구현 객체");
			}
			@Override
			public void sound(int volume) {
				this.a = volume;
				String str = "nyan";
				System.out.println("고양이: " + str);
				this.method();
				System.out.println(this.a);
			}
		};//여기까지 구현 객체
		soundable.sound(10);
		Soundable soundable1 = new Soundable() {
			//내부적으로는 클래스이기 때문에 맴버와 메서드를 생성할 수 있다
			//외부에서 접근은 불가능. 근본이 사운더블
			int a = 100;
			public void method() {
				System.out.println("익명 구현 객체");
			}
			@Override
			public void sound(int volume) {
				this.a = volume;
				String str = "wall";
				System.out.println("강아지: " + str);
				this.method();
				System.out.println(this.a);
			}
		};
		soundable1.sound(10);
	}
}
