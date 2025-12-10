package ch03;

/**
 * 1. 논리 연산의 결과는 boolean 타입을 산출한다.
 * 2. 논리 연산자는 흐름 제어문인 조건문(if), 반복문(for, while)에서 주로 사용된다.
 * 3. 논리 연산자의 종류
 *      && (논리곱) - 모두 참이면 참, 아니면 거짓
 *          -> 앞의 피연산자가 false이면 뒤의 피연산자를 평가하지 않음
 *      & (논리곱) - 모두 참이면 참, 아니면 거짓 
 *          -> 앞의 피연산자가 false라도 뒤의 피연산자를 평가함 
 *      || (논리합) - 모두 거짓이면 거짓, 아니면 참
 *          -> 앞의 피연산자가 true이면 뒤의 피연산자를 평가하지 않음
 *      | (논리합) - 모두 거짓이면 거짓, 아니면 참
 *          -> 앞의 피연산자가 true이어도 뒤의 피연산자를 평가함
 *      ! (논리 부정) - 참이면 거짓, 거짓이면 참
 *      ^ (배타적 논리합) - 서로 다르면 참, 아니면 거짓
 */
public class Ex08_논리연산자 {
        public static void main(String[] args) {
            int charCode = 'A';                
            //int charCode = 'a';                
            //int charCode = '5';                

            if ( (65<=charCode) & (charCode<=90)) {
                System.out.println("대문자이군요.");
            }
            if ( (97<=charCode) && (charCode<=122)) {
                System.out.println("소문자이군요.");
            }
            if ( (48<=charCode) && (charCode<=57)) {
                System.out.println("0~9 숫자이군요.");
            }

            int value = 6;
            // int value = 7;

            if ((value%2==0) | (value%3==0)) {
                System.out.println("2 또는 3의 배수이군요.");
            }

            boolean result = (value%2==0) || (value%3==0);
            if ( !result ) {
                System.out.println("2 또는 3의 배수가 아니군요.");
            }

        }
}
