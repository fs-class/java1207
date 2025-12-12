package ch05;

/**
 * 배열 복사
 * 1. 반복문으로 배열 복사
 * 2. arraycopy()로 배열 복사
 * 	- 배열 요소를 빠르게 복사하는 JVM 제공 메서드
 * 	- public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 * 	- System.arraycopy(원본배열, 원본배열시작인덱스, 복사대상배열, 복사대상배열쓰기시작인덱스, 복사할요소수)
 * 
 * 향상된 for문
 * 	- 배열 및 컬렉션을 좀 더 쉽게 처리할 목적으로 카운터 변수와 증감식을 사용하지 않고,
 *  - 항목의 개수만큼 반복한 후 자동으로 for 문을 빠져나간다.
 * 		for (타입 변수 : 배열) { 실행문; }
 * 
 * System.exit(status)
 * 	- Java 프로그램을 즉시 종료시키는 명령
 *  - status가 0 = 정상 종료, 0이 아닌 값 = 비정상 종료
 */
public class Ex07_배열기타 {
	public static void main(String[] args) {
		// 객체를 참조하는 배열
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println( strArray[0] == strArray[1] );		//true: 같은 객체 참조
		System.out.println( strArray[0] == strArray[2] );    	//false: 다른 객체를 참조
		System.out.println( strArray[0].equals(strArray[2]) );	//true: 문자열이 동일
		
		
		// 배열 복사
		//길이 3인 배열 
		int[] oldIntArray = { 1, 2, 3 };
		//길이 5인 배열을 새로 생성
		int[] newIntArray = new int[5];
		//배열 항목 복사
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		//배열 항목 출력
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", "); // 1, 2, 3, 0, 0,
		}
		
		// System.arraycopy(원본배열, 원본배열복사시작인텍스, 새배열, 새배열붙여넣기시작인덱스, 복사항목수)
		System.out.println("\n");
		//길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		//길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5];
		//배열 항목 복사
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//배열 항목 출력
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		
		System.out.println("\n\n");
		// 향상된 for문
		//배열 변수 선언과 배열 생성
		int[] scores = { 95, 71, 84, 93, 87 };
		//배열 항목 전체 합 구하기
		int sum = 0; 
		// 5개의 항목이 한 번씩 score 변수에 저장되고, sum에 누적됨 (반복 횟수: 5)
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		//배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);

		
		// main() 메서드의 String[] 메개변수 용도
		// Run > Run Configurations -> Project와 Main class 확인 후 -> Arguments에 값 입력 후 Run
		// 입력된 데이터 개수가 두 개가 아닐 경우
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			// 프로그램 강제 종료
			System.exit(0);
		}

		// 첫 번째 데이터 얻기
		String strNum1 = args[0];
		// 두 번째 데이터 얻기
		String strNum2 = args[1];
			
		// 문자열 정수로 변환
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
	}
}
