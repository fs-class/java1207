package ch02;

/**
 * 타입 변환
 * 	1. 자동 타입 변환
 * 		- 값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 대입될 때 발생한다.
 * 		- char(2) → int → long → float → double
 * 		- byte(1) → short(2) → int(4) → long(8) → float(4) → double(8)
 * 	2. 강제 타입 변환
 * 		- 큰 허용 범위 타입을 작은 허용 범위 타입으로 쪼개어서 저장하는 것
 * 		형식:
 * 			작은타입 변수 = (작은타입) 변수
 */
public class Ex10_타입변환 {
	public static void main(String[] args) {

		// 자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		
		// 강제 타입 변환
		int var1 = 10;
		byte var2 = (byte) var1;
		System.out.println(var2);

		long var3 = 300;
		int var4 = (int) var3;
		System.out.println(var4);
		
		int var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6);

		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println(var8);
		
		
		// 연산식에서 자동 타입 변환
		byte result1 = 10 + 20; // 컴파일 단계에서 연산
		System.out.println("result1: " + result1);
		
		/*
		 * Java에서 byte, short, char는 산술 연산 시 무조건 int로 변환된다.
		 * JVM은 CPU 연산 효율을 위해 int(32bit) 단위로 계산하는게 기본 방식이기 때문이다.
		 * int 타입보다 허용 범위가 더 큰 long 타입이 피연산자로 사용되면 다른 피연산자는 long 타입으로 변환되어 연산을 수행한다.
		 * 따라서, 연산 결과는 long 타입 변수에 저장해야 한다.
		 */
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2; // int 타입으로 변환 후 연산
		System.out.println("result2: " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5; // long 타입으로 변환 후 연산
		System.out.println("result3: " + result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7; // int 타입으로 변환 후 연산
		System.out.println("result4: " + result4);
		System.out.println("result4: " + (char)result4);
		
		int v8 = 10;
		int result5 = v8 / 4; // 정수 연산의 결과는 정수
		System.out.println("result5: " + result5);
		
		int v9 = 10;
		double result6 = v9 / 4.0; // double 타입으로 변환 후 연산
		System.out.println("result6: " + result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11; // double 타입으로 변환 후 연산
		System.out.println("result7: " + result7);
		
		
		/*
		 * + 연산자
		 * 	1. 피연산자가 모두 숫자일 경우에는 덧셈 연산
		 * 	2. 피연산자 중 하나가 문자열일 경우에는 나머지 피연산자도 문자열로 자동 변환되어 문자열 결합 연산을 수행한다. 
		 */
		
		// 덧셈 연산
		int result8 = 10 + 2 + 8;
		System.out.println("result8: " + result8);

		// 결합 연산
		String result9 = 10 + 2 + "8";
		System.out.println("result9: " + result9);
		
		String result10 = 10 + "2" + 8;
		System.out.println("result10: " + result10);
		
		String result11 = "10" + 2 + 8;
		System.out.println("result11: " + result11);
		
		String result12 = "10" + (2 + 8);
		System.out.println("result12: " + result12);
		
	}
}
