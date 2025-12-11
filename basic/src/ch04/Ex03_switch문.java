package ch04;


/**
 * if 문은 조건식의 결과가 true, false 두 가지밖에 없기 때문에 
 * 경우의 수가 많아질수록 else if를 반복적으로 추가해야 하므로 코드가 복잡해진다.
 * 그러나, switch 문은 변수의 값에 따라서 실행문이 결정되기 때문에 같은 기능의 if 문보다 코드가 간결해 진다.  
 */
public class Ex03_switch문 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");
		}
		
		System.out.println("----------------------------------");
		
		int time = (int)(Math.random()*4) + 8;  
		System.out.println("[현재시간: " + time + " 시]");
		
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다.");
		}
		
		System.out.println("----------------------------------");
		
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;							
			default:
				System.out.println("손님입니다.");
		}
		
		
		System.out.println("----------------------------------");
		
		// Java 12 이후부터
		// switch 문에서 Expressions(표현식)을 사용할 수 있다.
		// break 문 대신 화살표와 중괄호를 사용한다. 
		switch(grade) {
			case 'A', 'a' -> {
				System.out.println("우수 회원입니다.");
			}
			case 'B', 'b' -> {
				System.out.println("일반 회원입니다.");
			}						
			default -> {
				System.out.println("손님입니다.");
			}
		}

		// 중괄호 안에 실행문이 하나만 있는 경우에는 중괄호를 생략할 수 있다.
		switch(grade) {
			case 'A', 'a' -> System.out.println("우수 회원입니다.");
			case 'B', 'b' -> System.out.println("일반 회원입니다.");						
			default -> System.out.println("손님입니다.");
		}
		
		System.out.println("----------------------------------");
		String grade2 = "B";
		
		//Java 11 이전 문법
		int score1 = 0;
		switch(grade2) {
		    case "A":
		    	score1 = 100;
		    	break;
		    case "B":
		    	int result = 100 - 20;
		    	score1 = result;
		    	break;
		    default:
		    	score1 = 60;
		}
		System.out.println("score1: " + score1); // 80
		
		// Switch Expressions을 사용하면 스위치된 값을 변수에 바로 대입할 수 있다.
		// 단일 값일 경우에는 화살표 오른쪽에 값을 기술하면 되고,
		// 중괄호를 사용할 경우에는 yeild 키워드로 값을 지정하면 된다.
		// 단, 이 경우에는 default가 반드시 존재해야 한다.
		
		//Java 12부터 가능
		int score2 = switch(grade2) {
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;
				//Java 13부터 가능
				yield result;
			}
			default -> 60;
		};
		System.out.println("score2: " + score2); // 80
	}
}
