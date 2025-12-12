package ch05;

/**
 * String 클래스의 메서드
 *	1. charAt(인덱스)
 *		- 문자열에서 지정한 위치(index)의 문자 하나를 반환
 *		- index는 0이상 문자열 길이 미만
 *	2. length()
 *		- 문자열의 문자 개수를 반환
 *	3. replace()
 *		- 특정 문자 또는 문자열을 다른 문자 또는 문자열로 치환한 새로운 문자열을 반환
 *		- 원본 문자열은 변경되지 않는다.
 *	4. substring()
 *		- 문자열의 일부 구간(부분 문자열) 을 잘라내어 새로운 문자열로 반환
 * 		- 원본 문자열은 변경되지 않는다.
 *	5. indexOf()
 *		- 문자열이나 문자를 대상 문자열에서 검색하여, 처음 등장하는 위치(인덱스)를 반환
 *		- 찾지 못하면 -1 반환
 *	6. contains()
 *		- 문자열이 특정 문자열을 포함하고 있는지 여부를 판단하는 메서드
 *		- 대소문자 구분하며, 문자열이 완전히 일치해야 true
 *	7. split()
 *		- 문자열을 특정 구분자(Delimiter, 정규 표현식) 기준으로 나누어 
 *		- 문자열 배열(String[])로 반환하는 메서드
 */
public class Ex04_String메서드 {
	public static void main(String[] args) {
		String ssn = "9506241230123";
		// 문자 추출
		// 문자열.charAt(인덱스)
		char gender = ssn.charAt(6);
		switch (gender) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
		
		// 문자열 길이
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
		
		// 문자열 대체
		// 문자열.replace("특정문자열", "대체문자열")
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");

		System.out.println(oldStr);
		System.out.println(newStr);

		
		// 문자열 잘라내기
		// 문자열.substring(시작인덱스) -> 시작인덱스부터 끝까지
		// 문자열.substring(시작인덱스, 끝인덱스) -> 시작인덱스부터 끝인덱스-1까지
		String ssn2 = "880815-1234567";
		
		String firstNum = ssn2.substring(0, 6);
		System.out.println(firstNum); // 880815

		String secondNum = ssn2.substring(7);
		System.out.println(secondNum); // 1234567
		
		
		String subject = "자바 프로그래밍";

		// 문자열 찾기
		// 문자열.indexOf("문자열")
		int location = subject.indexOf("프로그래밍");
		System.out.println(location); // 3
		String substring = subject.substring(location);
		System.out.println(substring); // 프로그래밍

		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}

		// 문자열.contains("부분문자열")
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
		
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

		//문자열 분리
		// 문자열.split("구분자")
		String[] tokens = board.split(",");

		//인덱스별로 읽기
		System.out.println("번호: " + tokens[0]);
		System.out.println("제목: " + tokens[1]);
		System.out.println("내용: " + tokens[2]);
		System.out.println("성명: " + tokens[3]);
		System.out.println();
			
		//for 문을 이용한 읽기
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}
}
