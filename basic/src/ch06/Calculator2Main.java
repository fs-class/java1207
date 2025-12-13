package ch06;

/**
 * 정적 멤버 사용
 * 	- 클래스가 메모리에 로딩되면 정적 멤버를 바로 사용할 수 있다.
 *  - 클래스 이름과 함께 도트(.) 연산자로 접근하면 된다.
 *  - 객체를 생성하여 객체 참조 변수로도 접근 가능하다.
 *  -> 그러나, 정적 요소는 클래스 이름으로 접근하는 것이 정적이다.
 *  -> The static method plus(int, int) 
 *     from the type Calculator2 should be accessed in a static way 
 *     (Calculator2 타입의 정적 메서드 plus(int, int)는 정적 방식으로 접근해야 합니다.)
 * 
 * 		클래스명.필드명;
 * 		클래스명.메서드명();
 */
public class Calculator2Main {

	public static void main(String[] args) {
		
//		Calculator2 myCalcu = new Calculator2();
//		
//		double result1 = 10 * 10 * myCalcu.pi;
//		int result2 = myCalcu.plus(10, 5);
//		int result3 = myCalcu.minus(10, 5);

		double result1 = 10 * 10 * Calculator2.pi;
		int result2 = Calculator2.plus(10, 5);
		int result3 = Calculator2.minus(10, 5);

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
