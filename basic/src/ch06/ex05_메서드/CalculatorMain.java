package ch06.ex05_메서드;

/**
 * 15.메서드 호출
 *  - 클래스로부터 객체가 생성된 후에 메서드는 생성자와 다른 메서드 내부에서 호출될 수 있고,
 *    객체 외부에서도 호출될 수 있다.
 *		메서드명(인자,...);
 *
 *  - 객체 내부에서는 메서드명으로 호출
 *  - 외부 객체에서는 참조변수와 도트(.) 연산자를 이용해서 호출
 *  - 메서드가 매개변수를 가지고 있을 때는 호출할 때 매개변수의 타입과 수에 맞게 매개값을 제공해야 한다.
 *  - 메서드가 리턴값이 있을 경우 대입 연산자를 사용해서 리턴값을 변수에 저장할 수 있다.
 *  - 이때, 변수 타입은 메서드의 리턴 타입과 동일하거나 자동 타입 변환될 수 있어야 한다.
 *  	타입 변수 = 메서드(인자,...); 
 */
public class CalculatorMain {

	public static void main(String[] args) {
		//Calculator 객체 생성
		Calculator myCalc = new Calculator();
		
		//리턴값이 없는 powerOn() 메서드 호출
		myCalc.powerOn();

		//plus 메서드 호출 시 5와 6을 매개값으로 제공하고,
		//덧셈 결과를 리턴 받아 result1 변수에 대입
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);

		int x = 10;
		int y = 4;
		//divide() 메서드 호출 시 변수 x와 y의 값을 매개값으로 제공하고,
		//나눗셈 결과를 리턴 받아 result2 변수에 대입
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);

		//리턴값이 없는 powerOff() 메서드 호출
		myCalc.powerOff();
		
		//객체 생성
		Calculator myCalcu = new Calculator();

		//정사각형의 넓이 구하기
		double result3 = myCalcu.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result4 = myCalcu.areaRectangle(10, 20);

		System.out.println("정사각형 넓이=" + result3);
		System.out.println("직사각형 넓이=" + result4);

	}

}
