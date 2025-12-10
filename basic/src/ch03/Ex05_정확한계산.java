package ch03;

public class Ex05_정확한계산 {
        public static void main(String[] args) {

                // 산술 연산을 정확하게 계산하려면 실수 타입을 사용하지 않는 것이 좋다.

                int apple = 1;
                double pieceUnit = 0.1;
                int number = 7;

                double result = apple - number*pieceUnit;
                System.out.println("사과 1개에서 남은 양: " + result); // 사과 1개에서 남은 양: 0.29999999999999993
                
                int apple2 = 1;
                int totalPieces2 = apple2 * 10;
                int result2 = totalPieces2 - number;
                System.out.println("10조각에서 남은 조각: " + result2);
                System.out.println("사과 1개에서 남은 조각: " + result2/10.0);

                // 10조각에서 남은 조각: 3
                // 사과 1개에서 남은 조각: 0.3
        }
}
