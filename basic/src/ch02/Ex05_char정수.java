package ch02;

/**
 * 10진수 65와 매핑되는 문자는 'A'
 * 16진수 0x0041과 매핑되는 문자는 'A'
 */
public class Ex05_char정수 {
	public static void main(String[] args) {
		// 문자 저장
		char var1 = 'A';
		char var3 = '가';
		// 유니코드 직접 저장
		char var2 = 65;
		char var4 = 44032;
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
	}
}
