package gsmClass;

class GolfClub {
	int num;
	String name;
	GolfClub() {
		num = 7;
	}
	GolfClub(int num) {
		this.num = num;
	}
	GolfClub(String name) {
		this.name = name;
	}
	void print() {
		if(name == null) {
			System.out.println(num+"번 아이언입니다");
		}
		else {
			System.out.println(name+"입니다");
		}
	}
	
}

public class GolfClubTest {

	public static void main(String[] args) {
		GolfClub g1 = new GolfClub();
		g1.print();
		
		GolfClub g2 = new GolfClub(8);
		g2.print();
		
		GolfClub g3 = new GolfClub("퍼터");		
		g3.print();
	}
}
