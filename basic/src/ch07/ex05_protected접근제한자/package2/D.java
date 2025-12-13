package ch07.ex05_protected접근제한자.package2;

import ch07.ex05_protected접근제한자.package1.A;

/**
 *	protected 접근 제한자
 *	 - new 연산자를 사용해서 생성자를 직접 호출할 수 없고,
 *     자식 생성자에서 super()로 부모 생성자를 호출할 수 있다. 
 */
public class D extends A {
	// 상속을 통한 사용은 가능!
	//생성자 선언
	public D() {
		//A() 생성자 호출
		super();				//o
	}

	//메소드 선언
	public void method1() {
		//A 필드값 변경
		this.field = "value"; 	//o
		//A 메소드 호출
		this.method(); 			//o
	}

	//메소드 선언
	public void method2() {
		// 객체 생성을 통한 사용x
		// The constructor A() is not visible
		//A a = new A();		//x
		//a.field = "value"; 	//x
		//a.method(); 			//x
	}
}
