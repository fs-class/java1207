package ch06.ex08_인스턴스멤버와this키워드;

public class Car4Main {
	public static void main(String[] args) {
		Car4 myCar = new Car4("포르쉐");
		Car4 yourCar = new Car4("벤츠");

		myCar.run();
		yourCar.run();
	}
}
