package ch03;

/**
 * 1. 비교 연산의 결과는 boolean 타입을 산출한다.
 * 2. 비교 연산자는 흐름 제어문인 조건문(if), 반복문(for, while)에서 실행 흐름을 제어할 때 주로 사용된다.
 * 3. 비교 연산자의 종류
 *      ==
 *      !=
 *      >
 *      <
 *      >=
 *      <=
 * 
 */
public class Ex07_비교연산자 {
        public static void main(String[] args) {
                int num1 = 10;
                int num2 = 10;
                boolean result1 = (num1 == num2);
                boolean result2 = (num1 != num2);
                boolean result3 = (num1 <= num2);

                System.out.println("result1: " + result1); // true
                System.out.println("result2: " + result2); // false
                System.out.println("result3: " + result3); // true

                // 피연산자의 타입이 다를 경우에는 비교 연산을 수행하기 전에 타입을 일치시킨다.
                // char 타입이 int 타입으로 변환되어 'A'는 65, 'B'는 66
                char char1 = 'A';
                char char2 = 'B';
                boolean result4 = (char1 < char2);
                System.out.println("result4: " + result4); // true

                // int 1을 double 타입 1.0으로 변환되어 비교한다.
                int num3 = 1;
                double num4 = 1.0;
                boolean result5 = (num3 == num4);
                System.out.println("result5: " + result5); // true
                
                // float 타입과 double 타입의 정밀도 차이가 있으며,
                // 부동 소수점 방식을 사용하는 실수 타입은 0.1을 정확히 표현할 수 없다.
                // 따라서, 피연산자를 float 타입으로 강제 타입 변환 후에 비교 연산을 수행한다.
                float num5 = 0.1f;
                double num6 = 0.1;
                boolean result6 = (num5 == num6);
                boolean result7 = (num5 == (float) num6);
                System.out.println("result6: " + result6); // false
                System.out.println("result7: " + result7); // true
                
                // 문자열을 비교할 때는 equals()를 사용한다.
                String str1 = "자바";
                String str2 = "Java";
                // 원본문자열.equals(비교문자열)
                boolean result8 = (str1.equals(str2)); // 문자열이 같은지 검사(대소문자 구분)
                boolean result9 = (! str1.equals(str2)); // 문자열이 다른지 검사
                System.out.println("result8: " + result8); // false
                System.out.println("result9: " + result9); // true
                

        }
}
