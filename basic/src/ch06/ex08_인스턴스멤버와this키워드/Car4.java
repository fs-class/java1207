package ch06;

/**
 * 클래스 멤버
 * 	1. 인스턴스(Instance) 멤버
 * 		- 객체에 소속된 멤버
 * 		-> 객체를 생성후 사용
 *  2. 정적(Static) 멤버 
 *  	- 클래스에 고정된 멤버
 *  	-> 객체 없이도 사용
 * 
 * this 키워드
 *  - this는 객체 자신을 가리킨다.
 * 	- 왜? 객체 내부에서 인스턴스 멤버에 접근하기 위해 사용
 *  - 생성자와 메서드의 매개변수명이 인스턴스 멤버인 필드명과 같을 경우,
 *    인스턴스 필드에 this를 사용한다.
 */
public class Car4 {
	//필드 선언
	String model;
	int speed;

	//생성자 선언
	Car4(String model) {
		this.model = model; //매개변수를 필드에 대입(this 생략 불가)
	}
	
	//메서드 선언
	void setSpeed(int speed) {
		this.speed = speed; //매개변수를 필드에 대입(this 생략 불가)
	}

	// this 생략 가능
	void run() {
		setSpeed(100);
		System.out.println(model + "가 달립니다.(시속:" + speed + "km/h)");
	}
//	void run() {
//		this.setSpeed(100);
//		System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
//	}
}
