package ch06.ex05_메서드;

/**
 * 14.메서드 선언
 * 		리턴타입 메서드명(매개변수,...) { 실행코드; }
 * 
 *  - 리턴타입
 *  	- 메서드가 실행한 후 호출한 곳으로 전달하는 결과값의 타입
 *  	- 리턴값이 없는 메서드는 void로 작성한다.
 * 		- 리턴 타입이 있는 메서드는 실행 블록 안에서 return 문으로 리턴값을 반드시 지정해야 한다.
 * 
 *  - 메서드명은 카멜 표기법 (관례)
 *  
 * 18.메서드 오버로딩?
 * 	- 메서드 이름은 같고, 매개변수의 타입, 개수, 순서가 다른 메서드를 여러 개 선언하는 것
 * 	- 왜? 다양한 매개값을 처리하기 위해서
 */
public class Calculator {
	//리턴값이 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	//리턴값이 없는 메소드 선언
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	//호출 시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 int를 리턴하는 메소드 선언
	int plus(int x, int y) {
		int result = x + y;
		return result; //리턴값 지정;
	}

	//호출 시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 double을 리턴하는 메소드 선언
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result; //리턴값 지정;
	}
	
	// 메서드 오버로딩
	// 매개변수의 타입이 다름
	double plus(double x, double y) {
		double result = x / y;
		return result;
	}
	
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	// 매개변수의 개수가 다름
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
