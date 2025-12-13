package ch07.ex05_protected접근제한자.package1;

/**
 * 접근 제한자
 * 					제한 대상					제한 범위
 * 	1. public		필드, 생성자, 메서드, 클래스	없음
 *  2. protected	필드, 생성자, 메서드			같은 패키지, 자식 객체
 * 	3. default		필드, 생성자, 메서드, 클래스	같은 패키지
 *  4. private		필드, 생성자, 메서드			객체 내부 
 */
public class A {
	//필드 선언
	protected String field;

	//생성자 선언
	protected A() {
	}

	//메소드 선언
	protected void method() {
	}
}
