package ch02;

/**
 * byte 타입 변수의 저장 범위: -128~127
 */
public class Ex03_byte정수 {
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		byte var6 = 128; // 허용 범위 초과	
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		System.out.println("var6: " + var6);
	}
}
