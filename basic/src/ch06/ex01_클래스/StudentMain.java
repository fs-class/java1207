package ch06;

/**
 * 클래스
 * 1. 실행 클래스
 * 		- main 메서드를 가지로 있는 실행 가능한 클래스
 * 2. 라이브러리 클래스
 * 		- 실행할 수 없으며, 다른 클래스에서 이용하는 클래스
 * 
 * 자바 프로그램은 하나의 실행 클래스와 여러 개의 라이브러리 클래스들로 구성된다.
 * 
 * 클래스로부터 객체 생성
 * 		클래스 참조변수 = new 클래스(); 
 */
public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");

		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}
}
