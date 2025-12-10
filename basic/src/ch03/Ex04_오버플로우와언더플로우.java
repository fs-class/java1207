package ch03;

public class Ex04_오버플로우와언더플로우 {
        public static void main(String[] args) {

                // 오버플로우
                byte var1 = 125;
                for(int i=0; i<5; i++) { // {}를 5번 반복 실행
                        var1++; // ++ 연산은 var1의 값을 1 증가시킨다.
                        System.out.println("var1: " + var1);
                }
                // byte 타입의 경우 최대값 127에서 1을 더하면 128이 되어 오버플로우가 발생하고, 연산 결과는 -128이된다.
                /* 
                        var1: 126
                        var1: 127 // 127+1은 128로 오버플로우 발생
                        var1: -128
                        var1: -127
                        var1: -126
                */


                System.out.println("---------------------");

                // 언더플로우
                byte var2 = -125;
                for(int i=0; i<5; i++) {
                        var2--; // -- 연산은 var2의 값을 1 감소킨다.
                        System.out.println("var2: " + var2);
                }

                /* 
                        var2: -126
                        var2: -127
                        var2: -128 // -128에서 -1을 빼면 -129로 언더플로우 발생
                        var2: 127
                        var2: 126
                */

                // 오버플로우
                int x = 1000000;
                int y = 1000000;
                int z = x * y;
                System.out.println(z); // -727379968;
                // 1000000 * 1000000 = 10의 12승이 되어 int 타입 허용 범위 초과

                // long 타입으로 변환
                long x1 = 1000000;
                long y1 = 1000000;
                long z1 = x1 * y1;
                System.out.println(z1); // 1000000*1000000;
                // 1000000 * 1000000 = 10의 12승이 되어 int 타입 허용 범위 초과
                
        }
}
