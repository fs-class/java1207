package ch05;

// Ex08_Enum은 열거 타입명
/**
 * 열거 타입
 *	- 한정된 값을 갖는 타입
 *	- 예) 월,화,수,목,금,토,일
 *	- 예) 봄,여름,가을,겨울
 * 열거 상수
 * 	- 열거 타입으로 사용할 수 있는 한정된 값
 *  - 영문 대문자로 작성한다. (관례)
 *  - 단어 구분으로 _(언더바)로 연결 (관례)
 *
 * 사용법
 * 	- 열거 타입 이름으로 소스 파일(.java) 생성
 * 	- 한정된 값을 코드로 정의
 */
public enum Week {
	// 열거 상수 목록(한정된 값 목록)
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}
