package ch02;

/**
 * 변수 사용 범위
 */
public class Ex12_변수사용범위 {
	public static void main(String[] args) {
		// 메서드 블록에서 선언 
		// v1은 if 안밖에서 사용 가능!
		int v1 = 15;
		if(v1>10) {
			// if 블록에서 선언
			// v2는 if 블록 내부에서만 사용 가능!
			int v2 = v1 - 10;
		}
		//int v3 = v1 + v2 + 5; // v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
	}
}
