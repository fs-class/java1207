package ch02;

/**
 * 콘솔 출력
 * 	System.out.println()
 * 		- 시스템으로.출력하는데.괄호안의내용을출력하고행을바꿔라 
 * 		- 표준 출력 장치인 모니터(명령 프롬프트, 터미널, 콘솔)에 값을 출력
 * 		- () 안에 리터럴을 넣으면 리터럴이 그대로 출력되고,
 * 		- 변수를 넣으면 변수에 저장된 값이 출력된다.
 * 	System.out.print()
 * 		- 행은 바꾸지 않음
 * 	System.out.printf("형식문자열", 값1, 값2, ...)
 * 		- 형식 문자열에 맞추어 뒤의 값을 출력한다.
 * 		- 형식 문자열:
 * 			% [argument_index$][flags][width][.precision] conversion
 * 			% [값의 순번$][-, 0][전체 자릿수][.소수 자릿수] 변환문자
 * 			%는 형식 문자열의 시작을 뜻하고,
 * 			conversion은 d(정수), f(실수), s(문자열)
 * 			flags는 
 * 				생략하면 왼쪽이 공백으로 채워지고, 
 * 				-는 오른쪽이 공백으로 채워지고, 
 * 				0은 공백 대신 0으로 채운다.
 * 			width는 소숫점을 포함한 전체 자릿수
 */
public class Ex13_콘솔출력 {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		
		String name = "홍길동";
		String job = "개발자";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}
}
