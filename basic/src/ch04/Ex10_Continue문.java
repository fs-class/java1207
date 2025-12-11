package ch04;

public class Ex10_Continue문 {
	public static void main(String[] args) {
		// 1~10 중에서 짝수만 출력
		for(int i=1; i<=10; i++) {
			// 2로 나눈 나머지가 0이 아닐 경우, 즉 홀수인 경우
			if(i%2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
