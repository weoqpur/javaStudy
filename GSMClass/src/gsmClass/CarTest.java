package gsmClass;

class Car {
	private static int cnt = 0;
	private static int redCarCnt = 0;

	Car(String car) {
		cnt++;
		if (car == "red")
			redCarCnt++;
	}

	static int getNumOfCar() {
		return cnt;
	}

	static int getNumOfRedCar() {
		return redCarCnt;
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("red");
		Car c2 = new Car("purple");
		Car c3 = new Car("red");
		System.out.printf("자동차 수: %d, 빨간 자동차 수: %d", Car.getNumOfCar(), Car.getNumOfRedCar());
	}
}
