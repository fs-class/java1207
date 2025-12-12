package ch05;

/**
 * 데이터 타입
 * 1. 기본 타입(Primitive Type)
 * 		- 정수 타입
 * 		- 실수 타입
 * 		- 논리 타입
 * 2. 참조 타입(Reference Type)
 * 		- 배열 타입
 * 		- 열거 타입
 * 		- 클래스
 * 		- 인터페이스
 * 
 * 1. 기본 타입 변수
 * 		- 값 자체 저장
 * 2. 참도 타입 변수
 * 		- 객체가 생성된 메모리 번지(주소) 저장
 * 
 * 객체(Object)? 
 * 	- 데이터와 메서드로 구성된 덩어리
 *  - 데이터(필드) + 메서드
 */
public class Ex01_참조변수비교 {

	public static void main(String[] args) {
		int[] arr1; //배열 변수 arr1 선언
		int[] arr2; //배열 변수 arr2 선언
		int[] arr3; //배열 변수 arr3 선언
			
		arr1 = new int[] { 1, 2, 3 }; //배열 { 1, 2, 3 }을 생성하고 arr1 변수에 대입
		arr2 = new int[] { 1, 2, 3 }; //배열 { 1, 2, 3 }을 생성하고 arr2 변수에 대입
		arr3 = arr2; //배열 변수 arr2의 값을 배열 변수 arr3에 대입
		
		// arr1과 arr2 변수가 같은 배열을 참조하는지 검사
		System.out.println(arr1 == arr2); // false
		// arr2와 arr3 변수가 같은 배열을 참조하는지 검사
		System.out.println(arr2 == arr3); // true

	}

}
