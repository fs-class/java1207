package ch03;

public class Ex01_부호연산자 {
    // 실행은 ctrl+F5
	public static void main(String[] args) {
        // 부호 연산자
        int x = -100;
        x = -x;

        byte b = 100;
        //byte y = -b; // 컴파일 에러? 정수 타입(byte, short, int) 연산 결과는 int 타입이다.
        int y = -b;

        // syso쓰고 탭
        System.out.println("x: " + x);
        System.out.println("y: " + y);

	}
}
