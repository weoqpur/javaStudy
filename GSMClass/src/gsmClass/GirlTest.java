package gsmClass;

class Girl {
	protected String name;

	void show() {
		System.out.println(name + "�� �ڹ� �ʺ����̴�.");
	}

	Girl(String name) {
		this.name = name;
	}
}

class GoodGirl extends Girl {

	GoodGirl(String name) {
		super(name);
	}

	void show() {
		System.out.println(name + "�� �ڹٸ� �� �ȴ�.");
	}
}

class BastGirl extends GoodGirl {

	BastGirl(String name) {
		super(name);
	}

	void show() {
		System.out.println(name + "�� �ڹٸ� �����ϰ� �� �ȴ�.");
	}
}

public class GirlTest {

	public static void main(String[] args) {
		Girl[] girls = { new Girl("������"), new GoodGirl("����"), new BastGirl("Ȳ����") };

		for (Girl g : girls) {
			g.show();
		}
	}
}
