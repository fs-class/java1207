package ch04;

/**
 * for 문은 정해진 횟수만큼 반복한다면,
 * while 문은 조건식이 true일 경우에 계속해서 반복하고,
 * false가 되면 반복을 멈추고 while 문을 종료한다. 
 */
public class Ex06_while문 {
	public static void main(String[] args) {
		int i = 1;
		while (i<=10) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		System.out.println("----------------------");
		// 1~100까지의 합
		int sum = 0;
		i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}

		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}
