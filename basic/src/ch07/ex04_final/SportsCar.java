package ch07.ex04_final;

/**
 * final 메서드
 * 	- 오버라이딩x 
 */
public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}

	// 부모 메서드가 final 메서드이면 오버라이딩을 할 수 없음
	// Cannot override the final method from Car
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}
