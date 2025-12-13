package ch07.ex06_타입변환;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

/**
 * 타입 변환?
 *	- 타입을 다른 타입으로 변환하는 것
 *
 * 클래스 타입 변환
 *  - 상속 관계에 있는 클래스 사이에 발생한다.
 *  
 * 자동 타입 변환
 * 	
 * 		부모타입 변수 = 자식타입객체;
 * 
 */
public class PromotionMain {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		// 상속 관계에 있음(자동 타입 변환)
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// 상속 관계에 있지 않음(컴파일 에러)
		// B b3 = e;
		// C c2 = d;
	}
}
