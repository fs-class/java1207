package ch03;

/**
 * 삼항(조건) 연산자
 *      피연산자1 ? 피연산자2 : 피연산자3
 *      (조건식) ? 값 또는 연산식 : 값 또는 연산식
 */
public class Ex12_삼항연산자 {
    public static void main(String[] args) {
        int score = 85;

        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");

    }
}
