package ch06.ex04_this생성자호출;

/**
 * 13.this()
 * 	- 다른 생성자를 호출 
 */
public class Car2 {
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 오버로딩이 많은 경우 생성자 간의 중복된 코드가 발생할 수 있다.
//	Car2(String model) {
//		this.model = model;
//		this.color = "은색";
//		this.maxSpeed = 250;
//	}
//
//	Car2(String model, String color) {
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 250;
//	}
//
//	Car2(String model, String color, int maxSpeed) {
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}

	// 다른 생성자 호출
	// - 공통 코드를 한 생성자에 작성하고, 
	// - 나머지 생성자는 this(...)를 사용하여 공통 코드를 가진 생성자를 호출
	Car2(String model) {
		//20라인 생성자 호출
		this(model, "은색", 250);
	}
	
	Car2(String model, String color) {
		//20라인 생성자 호출
		this(model, color, 250);
	}
	
	// 공통 코드를 가진 생성자
	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
