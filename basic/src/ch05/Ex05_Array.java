package ch05;

/**
 * 배열(Array)?
 * 	- 연속된 공간에 값을 나열시키고, 각 값에 인덱스(index)를 부여해 놓은 자료구조이다.
 *  - 인덱스는 대괄호[]와 함께 사용하여 각 항목의 값을 읽거나 저장하는데 사용한다.
 *  - 배열은 같은 타입의 값만 관리한다.
 *  - 배열의 길이는 생성과 동시에 길이가 결정된다. -> 늘리거나 줄일 수 없다.
 *  
 * 배열 변수 선언
 * 	1. 타입[] 변수; (관례)
 *  2. 타입 변수[];
 *  
 * 배열 생성
 * 	1. 값 목록으로 배열 생성
 * 		타입[] 변수 = {값0, 값1, ... };
 *  2. new 연산자로 배열 생성
 *  	타입[] 변수 = new 타입[] {값0, 값1, ...};
 *  	- 값 목록은 없이만 향후 값들을 저장할 목적으로 배열을 미리 생성할 수 있다.
 *  	타입[] 변수 = new 타입[길이];
 *  	- 배열 변수 선언된 후에도 할당 가능
 *  	타입[] 변수 = null;
 *  	변수 = new 타입[길이];
 *  	- new 연산자로 배열을 처음 생성하면 배열 항목은 기본값으로 초기화된다.
 *  	-> 정수 배열은 0, 실수 배열은 0.0, 논리 배열은 false, 참조 배열은 null
 *  
 * 배열 길이
 * 	- 배열에 저장할 수 있는 항목 수
 *  - 읽기 전용! -> 값을 바꿀 수 없다.
 * 	- 배열변수.length  	
 */
public class Ex05_Array {

	public static void main(String[] args) {
		//배열 변수 선언과 배열 생성
		String[] season = { "Spring", "Summer", "Fall", "Winter" };

		//배열의 항목값 읽기
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);

		//인덱스 1번 항목의 값 변경
		season[1] = "여름";
		System.out.println("season[1] : " + season[1]);
		System.out.println();

		//배열 변수 선언과 배열 생성
		int[] scores = { 83, 90, 87 };

		//총합과 평균 구하기
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
		
		
		//배열 변수에 배열을 대입
		scores = new int[] { 83, 90, 87 };
		//배열 항목의 총합을 구하고 출력
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);

		// printItem() 메서드 호출 시 
		// 매개값으로 중괄호로 감싼 값 목록을 주면 컴파일 에러가 발생한다.
		// 잘못된 메서드 호출
		//printItem( { 83, 90, 87 } ); // 컴파일 에러
		
		//배열을 매개값으로 주고, printItem() 메소드 호출
		// 올바른 메서드 호출
		printItem( new int[] { 83, 90, 87 } );
		
		//배열 변수 선언과 배열 생성
		int[] arr1 = new int[3];
		//배열 항목의 초기값 출력
		for(int i=0; i<3; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println();
		//배열 항목의 값 변경
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		//배열 항목의 변경 값 출력
		for(int i=0; i<3; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println("\n");

		//배열 변수 선언과 배열 생성
		double[] arr2 = new double[3];
		//배열 항목의 초기값 출력
		for(int i=0; i<3; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println();
		//배열 항목의 값 변경
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		//배열 항목의 변경 값 출력
		for(int i=0; i<3; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println("\n");

		//배열 변수 선언과 배열 생성
		String[] arr3 = new String[3];
		//배열 항목의 초기값 출력
		for(int i=0; i<3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}
		System.out.println();
		//배열 항목의 값 변경
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		//배열 항목의 변경값 출력
		for(int i=0; i<3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}
		
		System.out.println();
		//배열 변수 선언과 배열 대입
		//int[] scores = { 84, 90, 96 };

		// 배열 길이
		//배열 항목의 총합 구하기
		sum = 0;
		// for 문의 조건식에서 < 연산자를 사용한 이유?
		// 배열의 마지막 인덱스는 배열 길이보다 1이 적기 때문이다.
		// -> 인덱스를 초과해서 사용하면 ArrayIndexOutOfBoundsException이 발생한다.
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);

		//배열 항목의 평균 구하기
		avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);

	}
	
	//printItem() 메소드 선언
	public static void printItem( int[] scores ) {
		//매개변수가 참조하는 배열의 항목을 출력
		for(int i=0; i<3; i++) {
			System.out.println("score[" + i + "]: " + scores[i]);
		}
	}

}
