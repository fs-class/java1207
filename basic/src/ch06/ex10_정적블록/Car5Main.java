package ch06.ex10_정적블록;

/**
 * 23.정적 메서드와 정적 블록에서 인스턴스 멤버를 사용하려면?
 * -> 객체 생성 후 참조 변수로 접근한다. 
 */
public class Car5Main {
	//인스턴스 필드 선언
	int speed;

	//인스턴스 메소드 선언
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	static void simulate() {
		//객체 생성
		Car5Main myCar = new Car5Main();
		//인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run();
	}

	// 메인 메서드도 정적 메서드이므로 
	// -> 객체 생성 없이 인스턴스 필드와 인스턴스 메서드를 바로 사용할 수 없다.
	public static void main(String[] args) {
		// 컴파일 에러
//		speed = 60;
//		run();
		
		//정적 메소드 호출
		simulate();
		
		//객체 생성
		Car5Main myCar = new Car5Main();
		//인스턴스 멤버 사용
		myCar.speed = 60;
		myCar.run();

	}

}
