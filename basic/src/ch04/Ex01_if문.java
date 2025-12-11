package ch04;

public class Ex01_if문 {

	public static void main(String[] args) {
		int score = 93;
		
		// if
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90)
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다."); // if 문과는 상관없는 실행문

		System.out.println("----------------------------");
			
		score = 85;

		// if ~ else
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		System.out.println("----------------------------");
		
		score = 75;

		// if ~ else if ~ else
		if(score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score>=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		
		System.out.println("--------------------------------");
		
		// Math.random(): 0.0 이상 1.0 미만의 double 난수를 반환
		// 0.0 <= Math.random() < 1.0
		// 0.0 * 20 <= Math.random() * 20 < 1.0 * 20
		// 0.0 <= Math.random() * 20 < 20.0
		// (int)0.0 <= (int)(Math.random() * 20) < (int)20.0
		// 0 <= (int)(Math.random() * 20) < 20
		// 0 + 81 <= (int)(Math.random() * 20) + 81 < 20 + 81
		// 81 <= (int)(Math.random() * 20) + 81 < 101
		
		// 81 ~ 100 사이 정수
		score = (int)(Math.random()*20) + 81;
		System.out.println("점수: " + score);
		
		String grade;
		
		// if 안의 if (중첩if)
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {	
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);
		
		

	}

}
