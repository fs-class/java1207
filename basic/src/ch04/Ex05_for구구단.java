package ch04;

public class Ex05_for구구단 {
	public static void main(String[] args) {
		// 중첩된 for문
		for (int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}		
	}
}
