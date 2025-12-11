package ch02;

/**
 * 타입 변환
 * 	1. 자동 타입 변환
 * 		- 값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 대입될 때 발생한다.
 * 		- char(2) → int → long → float → double
 * 		- byte(1) → short(2) → int(4) → long(8) → float(4) → double(8)
 *
 * 	2. 강제 타입 변환
 * 		- 큰 허용 범위 타입을 작은 허용 범위 타입으로 쪼개어서 저장하는 것
 * 		형식:
 * 			작은타입 변수 = (작은타입) 변수
 *
 *  3. 문자열을 기본 타입으로 변환
 *  	Byte.parseByte(str);
 *  	Short.parseShort(str);
 *  	Integer.parseInt(str);
 *  	Long.parseLong(str);
 *  	Float.parseFloat(str);
 *  	Double.parseDouble(str);
 *  	Boolean.parseBoolean(str);
 *  
 *  4. 기본 타입을 문자열로 변환
 *  	String.valueOf(기본타입값);
 */
public class Ex11_문자열변환 {
	public static void main(String[] args) {

		// 문자열 -> 기본 타입
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		// 기본 타입 -> 문자열
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
	}
}
