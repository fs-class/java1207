// A와 B 클래스는 같은 패키지
package ch06.Ex13.package1;

public class B {
	// A 클래스 접근 가능(필드로 선언할 수 있음)
	A a;

	// 필드 선언
	// public 생성자로 접근 가능
	A a1 = new A(true);
	// default 생성자로 접근 가능
	A a2 = new A(1);

	// private 생성자로 접근 불가(컴파일 에러)
	//A a3 = new A("문자열");

	public void method() {
		//객체 생성
		A2 a = new A2();

		//필드값 변경
		// public 필드 접근 가능
		a.field1 = 1;
		// default 필드 접근 가능
		a.field2 = 1;
		// private 필드 접근 불가(컴파일 에러)
		//a.field3 = 1;

		//메소드 호출
		// public 메서드 접근 가능
		a.method1();
		// default 메서드 접근 가능
		a.method2();
		// private 메서드로 접근 불가(컴파일 에러)
		//a.method3();
	}
}
