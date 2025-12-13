package ch06.Ex13.package1;

/**
 * 27.접근 제한자
 * 					제한 대상					제한 범위
 * 	1. public		필드, 생성자, 메서드, 클래스	없음
 *  2. protected	필드, 생성자, 메서드			같은 패키지, 자식 객체
 * 	3. default		필드, 생성자, 메서드, 클래스	같은 패키지
 *  4. private		필드, 생성자, 메서드			객체 내부
 *  
 *  지정하지 않으면 default
 *  
 *  클래스 접근 제한
 *  	[public] class 클래스명 {...}
 *  생성자 접근 제한
 *  	[public|private] 생성자명(...) {...}
 *  필드 접근 제한
 *  	[public|private] 타입 필드;
 *  메서드 접근 제한
 *  	[public|private] 리턴타입 메서드(...) {...}
 */

// default 클래스
class A {
	//필드 선언
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");

	//public 접근 제한 생성자 선언
	public A(boolean b) {
	}
	
	//default 접근 제한 생성자 선언
	A(int b) {
	}

	//private 접근 제한 생성자 선언
	private A(String s) {
	}
}
