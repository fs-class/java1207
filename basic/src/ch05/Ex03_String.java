package ch05;

/**
 * 문자열 생성 방법
 * 1. 문자열 리터럴
 * 		String str = "값";
 * 2. new 연산자 
 * 		String str = new String("값");
 * 
 * 문자열 비교
 * 1. 비교 연산자(==, !=) -> 주소 비교
 * 2. str1.equals(str2) -> 내용(값) 비교
 */
public class Ex03_String {
	public static void main(String[] args) {
		// 문자열 리터럴이 같으면 String 객체를 공유한다.
		// -> 동일한 String 객체의 번지가 저장된다.
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
			
		// new 연산자? 새로운 객체를 만드는 연산자(객체 생성 연산자)
		// new 연산자로 객체를 생성하면 서로 다른 String 객체의 번지를 가진다.
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");

		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
		// 빈 문자열도 String 객체로 생성된다.
		String hobby = "";
		if(hobby.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
		}
	}
}
