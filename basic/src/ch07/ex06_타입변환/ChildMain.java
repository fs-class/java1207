package ch07.ex06_타입변환;

/**
 * 1. 자동 타입 변환
 *	- 부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메서드만 접근 가능하다.
 *  - 단, 자식 클래스에서 오버라이딩된 메서드는 자식 메서드가 호출된다.
 *  
 * 2. 강제 타입 변환
 * 	- 자식 객체가 부모 타입으로 자동 변환된 후 
 *    다시 자식 타입으로 변환할 때 강제 타입 변환을 사용할 수 있다.
 *		
 *		자식타입 변수 = (자식타입) 부모타입객체;
 *
 */
public class ChildMain {

	public static void main(String[] args) {
		// 자식 객체 생성
		Child child = new Child();

		// 부모 클래스로 자동 타입 변환
		Parent parent = child;

		// 부모 클래스에 선언된 필드와 메서드만 접근 가능
		parent.method1();
		// 오버라이딩된 자식 메서드가 호출된다.
		parent.method2();
		
		// 자식 메서드는 호출 불가능
		//parent.method3();
		
		
		System.out.println("\n");
		//객체 생성 및 자동 타입 변환
		Parent parent2 = new Child();
		
		//Parent 타입으로 필드와 메소드 사용
		parent2.field1 = "data1";
		parent2.method1();
		parent2.method2();
		/*
		parent2.field2 = "data2";      	//(불가능)
		parent2.method3();         		//(불가능)
		*/
		
		//강제 타입 변환
		Child child2 = (Child) parent;
		
		//Child 타입으로 필드와 메소드 사용
		child2.field2 = "data2";  		//(가능)
		child2.method3();     			//(가능)

	}

}
