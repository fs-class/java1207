package ch07.ex02_부모생성자호출;

/**
 * super()
 * 	- 부모의 기본 생성자 호출
 *  - 컴파일 과정에서 자동 추가된다.
 *
 * 1. 부모의 기본 생성자가 있는 경우
 *  - 자식 생성자에서 super() 생략 가능
 *
 * 2. 부모 클래스에 기본 생성자가 없고, 매개변수를 갖는 생성자만 있는 경우
 *  - super(매개값,...) 코드를 직접 지정해야 한다.
 *  - 자식 생성자의 맨 첫 줄에서만 사용 가능!
 *
 *  	// 자식 생성자
 *  	public 자식클래스() {
 *  		super(매개값, ...);
 *  	}
 */
public class SmartPhone extends Phone {

	//자식 생성자 선언
//	public SmartPhone(String model, String color) {
//		// 부모 생성자 호출
//		// super();
//		this.model = model;
//		this.color = color;
//		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
//	}

	//자식 생성자 선언
	public SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}

}
