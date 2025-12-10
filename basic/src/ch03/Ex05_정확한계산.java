package ch03;

public class Ex05_정확한계산 {
        public static void main(String[] args) {

                
                int apple = 1;
                // 부동 소수점 방식을 사용하는 실수 타입에서는 
                // 결과 값이 정확히 0.3이 되지 않는다.
                double pieceUnit = 0.1;
                int number = 7;
                
                double result = apple - number*pieceUnit;
                System.out.println("사과 1개에서 남은 양: " + result); // 사과 1개에서 남은 양: 0.29999999999999993
                
                // -> 정확한 계산이 필요하다면 정수 연산으로 변경해서 계산하는 것이 좋다.
                int apple2 = 1;
                int totalPieces2 = apple2 * 10;
                int result2 = totalPieces2 - number;
                System.out.println("10조각에서 남은 조각: " + result2);
                System.out.println("사과 1개에서 남은 조각: " + result2/10.0);

                // 10조각에서 남은 조각: 3
                // 사과 1개에서 남은 조각: 0.3
        }
}
