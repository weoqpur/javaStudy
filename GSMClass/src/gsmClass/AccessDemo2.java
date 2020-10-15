package gsmClass;
class AccessEx2{
	private int num;
	
	//setter
	void setNum(int num) {
		this.num = num;
	}
	
	int getNum() {
		return this.num;
	}
}
public class AccessDemo2 {
	public static void main(String[] args) {
		AccessEx2 a = new AccessEx2();
		
		a.setNum(100);
		System.out.println(a.getNum());
		// private은 외부에서 접근이 불가능
		// 하지만 외부에서 접근이 가능하게 하려면 getter(접근자)
		// setter(설정자) 사용
		// getter : 값을 반환하는 것
		// setter : 값을 설정하는 것
	}
}