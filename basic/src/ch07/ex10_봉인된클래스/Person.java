package ch07.ex10_봉인된클래스;

/**
 * 봉인된(sealed) 클래스
 * 	- 기본적으로 final 클래스를 제외한 모든 클래스는 부모 클래스가 될 수 있다.
 *  - 그러나, Java 15부터 봉인된(sealed) 클래스가 도입되었다.
 *  -> 왜? 무분별한 자식 클래스 생성 방지
 *  - sealed 키워드를 사용하면 permits 키워드 뒤에 상속 가능한 자식 클래스를 지정해야 한다.
 *
 *		[접근제한자] sealed class 부모클래스 permits 자식클래스1, 자식클래스2 { ... }
 */

// Person의 자식 클래스는 Employee와 Manager만 가능
public sealed class Person permits Employee, Manager {
	//필드
	public String name;

	//메소드
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
	}
}
