package ch02;

public class Ex01_변수초기화 {
	public static void main(String[] args) {
//		int value;
		// 변수를 연산식에 사용하려면 값을 할당해야 한다.
//		int result = value + 10;
//		System.out.println(result);
		
		int hour=3;
		int minute=5;
		System.out.println(hour + "시간 " + minute + '분');
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + '분');
		
		// 변수 값 교환
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + ", y:" + y);
	}
}
