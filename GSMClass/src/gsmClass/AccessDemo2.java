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
		// private�� �ܺο��� ������ �Ұ���
		// ������ �ܺο��� ������ �����ϰ� �Ϸ��� getter(������)
		// setter(������) ���
		// getter : ���� ��ȯ�ϴ� ��
		// setter : ���� �����ϴ� ��
	}
}