package ch05;

/**
 * null & NullPointerException
 * 1. null? 
 * 	- 참조 타입 변수가 아직 번지를 저장하고 있지 않다는 뜻
 * 2. NullPointerException? 
 * 	- 변수가 null인 상태에서 객체의 데이터나 메서드를 사용하려 할 때 발생
 * 예외(Exception)? 프로그램 실행 도중에 발생하는 오류
 */
public class Ex02_Null {

	public static void main(String[] args) {
		// intArray가 참조하는 배열 객체가 없으므로 10을 저장할 수 없다.
		int[] intArray = null;
		//intArray[0] = 10; //NullPointerException

		// str 변수가 참조하는 String 객체가 없으므로 문자열의 길이를 구할 수 없다.
		String str = null;
		//System.out.println("총 문자 수: " + str.length() );//NullPointerException
		
		String hobby = "여행";
		hobby = null; // "여행"에 해당하는 String 객체를 쓰레기로 만듦

		String kind1 = "자동차";
		String kind2 = kind1; // kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
		kind1 = null; // "자동차"에 해당하는 String 객체는 쓰레기가 아님
		System.out.println("kind2: " + kind2);

	}

}
