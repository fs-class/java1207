package ch07.ex10_봉인된클래스;

// 봉인된 Person 클래스를 상속하는 Employee와 Manager는
// final 또는 non-sealed 키워드로 선언하거나,
// sealed 키워드를 사용해서 또 다른 봉인 클래스로 선언해야 한다.
// final은 더 이상 상속할 수 없다는 뜻이고,
// non-sealed는 봉인을 해제한다는 뜻이다.
public final class Employee extends Person {
	@Override
	public void work() {
		System.out.println("제품을 생산합니다.");
	}
}
