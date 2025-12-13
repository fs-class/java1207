package ch06.ex02_필드와생성자;

/**
 * 08.필드 사용
 *  - 클래스로부터 객체가 생성된 후에 필드를 사용할 수 있다.
 *  - 필드는 객체 내부의 생성자와 메서드 내부에서 사용할 수 있고,
 *    객체 외부에서도 접근해서 사용할 수 있다.
 *  -> 객체 내부에서는 단순히 필드명으로 읽고 변경할 수 있지만,
 *     외부 객체에서는 참조 변수와 도트(.) 연산자를 이용해서 필드를 읽고 변경해야 한다.
 *  -> 도트(.)는 객체 접근 연산자로 객체가 가지고 있는 필드나 메서드에 접근하고자 할 때
 *     참조 변수 뒤에 붙인다.
 *    		참조변수.필드
 *    	 	참조변수.메서드() 
 */
// 외부 클래스
public class Car1Main {
	public static void main(String[] args) {
		// 1. Car 객체 생성 후
		// 클래스 참조변수 = new 클래스();
		Car1 myCar = new Car1();
		Car1 myCar2 = new Car1("그랜저", "검정", 250);

		// 2. Car 객체의 필드값 읽기
		// 참조변수.필드
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);

		//Car 객체의 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	}
}
