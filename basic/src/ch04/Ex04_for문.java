package ch04;

public class Ex04_for문 {
	public static void main(String[] args) {
		// for(초기화식; 조건식; 증감식) { 실행문; }
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("-----------------------");

		// 1~100까지 합
		int sum = 0; // sum은 합계 변수
		int i; // i는 카운터 변수

		for(i=1; i<=100; i++) {
			sum += i;
		}

		System.out.println("1~" + (i-1) + " 합 : " + sum);

		System.out.println("-----------------------");

		// 부동 소수점 방식의 float 타입은 연산 과정에서 정확히 0.1을 표현하지 못하기 때문에
		// 증감식에서 x에 더해지는 실제 값은 0.1보다 약간 클 수 있다.
		// 따라서, 최종 반복 횟수는 9번이 된다.
		System.out.println();
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}
}
