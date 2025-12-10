package ch03;

public class Ex06_NaN_Infinity {
        public static void main(String[] args) {

                //System.out.println(5 / 0); // java.lang.ArithmeticException: / by zero
                //System.out.println(5 % 0); // java.lang.ArithmeticException: / by zero

                int x = 5;
                double y = 0.0;
                double z = x / y;
                //double z = x % y;

                // 잘못된 코드
                // 왜? Infinity 또는 NaN 상태에서 연산을 계속 수행하면 결과는 Infinity와 NaN이 되므로 Infinity 또는 NaN 상태에서 계속해서 연산을 수행하면 안된다.
                System.out.println(z + 2); // Infinity(무한대)
                System.out.println(5 / -0.0); // -Infinity(무한대)
                System.out.println(5 % 0.0); // NaN(Not a Number)

                // 알맞은 코드
                // / 와 % 연산의 결과가 Infinity 또는 NaN인지 먼저 확인하고 다음 연산을 수행하는 것이 좋다.
                if(Double.isInfinite(z) || Double.isNaN(z)) {
                        System.out.println("값 산출 불가"); // 값 산출 불가
                } else {
                        System.out.println(z + 2);
                }
        }
}
