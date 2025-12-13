package ch07.ex04_final;

/**
 * final 메서드
 * 	
 * 		[접근제한자] final 리턴타입 메서드(매개변수,...) {...} 
 */
public class Car {
	//필드 선언
	public int speed;

	//메소드 선언
	public void speedUp() {
		speed += 1;
	}

	//final 메소드
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
