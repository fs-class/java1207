// C 클래스는 A,B 클래스와 다른 패키지
package ch06.Ex13.package2;

import ch06.Ex13.package1.A2;
import ch06.Ex13.package1.B;

public class C {
	//필드 선언
	// A는 default 클래스 접근 불가
	//A a;
	//A a1 = new A(true);
	//A a2 = new A(1);
	//A a3 = new A("문자열");

	// B는 public 클래스 접근 가능
	B b;

	// A2는 public 클래스 접근 가능
	// A2(true)는 public 생성자 접근 가능
	A2 a1 = new A2(true);
	// A2(1) default 생성자 접근 불가
	// A2 a2 = new A2(1);
	// A2("문자열") private 생성자 접근 불가
	// A2 a3 = new A2("문자열");
	
	public C() {
		//객체 생성 
		A2 a = new A2();
		
		//필드값 변경
		// public 필드 접근 가능
		a.field1 = 1;
		// default 필드 접근 불가(컴파일 에러)
		//a.field2 = 1;
		// private 필드 접근 불가
		//a.field3 = 1;

		//메소드 호출 
		// public 메서드 접근 가능
		a.method1();
		// default 메서드 접근 불가
		//a.method2();
		// private 메서드 접근 불가
		//a.method3();
	}
}
