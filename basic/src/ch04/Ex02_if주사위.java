package ch04;

public class Ex02_if주사위 {

	public static void main(String[] args) {
		// Math.random(): 0.0 이상 1.0 미만의 double 난수를 반환
		
		// 0.0 <= Math.random() < 1.0
		// 0.0 * 6 <= Math.random() * 6 < 1.0 * 6
		// (int)0.0 <= (int)(Math.random() * 6) < (int)6.0
		// 0 <= (int)(Math.random() * 6) < 6
		// 0 + 1 <= (int)(Math.random() * 6) + 1 < 6 + 1
		// 1 <= (int)(Math.random() * 6) + 1 < 7

		// start부터 시작하는 n개의 정수 중에서 하나의 정수를 얻기 위한 코드
		// int num = (int) (Math.random() * n) + start
		
		// 로또 번호(1, ..., 45) 중 하나 뽁기
		// int num = (int) (Math.random() * 45) + 1

		// 1~6 사이 정수
		int num = (int)(Math.random()*6) + 1;

		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}

	}

}
