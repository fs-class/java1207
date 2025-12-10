package ch03;

public class Ex03_산술연산자 {
	public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 4;
        long v3 = 10L;

        // 피연산자가 정수 타입(byte, short, char, int)이면 연산 결과는 int 타입
        int result1 = v1 + v2;
        System.out.println("result1=" + result1); // result1=14

        // 피연산자가 정수 타입이고, 그 중 하나가 long 타입이면 연산 결과는 long 타입
        long result2 = v1 + v2 - v3;
        System.out.println("result2=" + result2); // result2=4

        // 피연산자 중 하나가 실수 타입이면 연산 결과는 실수 타입이다.
        double result3 = v1 / v2;
        double result4 = (double) v1 / v2;
        System.out.println("result3=" + result3); // result3=2.0
        System.out.println("result4=" + result4); // result3=2.5

        int result5 = v1 % v2;
        System.out.println("result5=" + result5); // result5=2
	}
}
