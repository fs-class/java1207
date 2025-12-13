package ch07.ex09_추상클래스;

public class PhoneMain {

	public static void main(String[] args) {
		// 추상 클래스 이므로 객체 생성x
		//Phone phone = new Phone();

		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
