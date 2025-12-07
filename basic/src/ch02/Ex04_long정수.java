package ch02;

/**
 * int 타입 변수의 저장 범위: -2,147,483,648~2,147,483,647,127 -> 대략+-21억
 * 위 값을 초과하면 리터럴 뒤에 소문자 l 또는 대문자 L을 붙여 long 타입으로 지정한다.
 */
public class Ex04_long정수 {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20l;
		// 컴파일러는 int로 간주하기 때문에 에러 발생
		//long var3 = 10000000000;
		long var4 = 10000000000L;
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		//System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
	}
}
