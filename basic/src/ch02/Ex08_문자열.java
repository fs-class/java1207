package ch02;

/**
 * 문자 vs 문자열
 * 하나의 문자를 작은따옴표(')로 감싼 것을 문자 리터럴이라고 한다.
 * 문자 리터럴은 유니코드로 변환되어 저장된다.
 * 유니코드는 세계 각국의 문자를 0~65535 숫자로 매핑한 국제 표준 규약이다.
 * 작은 따옴표(')로 감싼 한 개의 문자는 char 타입이지만,
 * 큰 따옴표(")로 감싼 여러 개의 문자들은 유니코드로 변환되지 않는다.
 * 문자열을 변수에 저장할 때는 String 타입을 사용한다.
 * String 타입은 참조 타입이다.
 * 
 * 이스케이프(escape) 문자
 * 	\"
 * 	\'
 * 	\\
 * 	\t	탭(tab)
 * 	\n	줄바꿈(Line Feed, LF)
 * 	\r	캐리지 리턴(CR, Carriage Return)
 */
public class Ex08_문자열 {
	public static void main(String[] args) {
		//char var1 = "A"; // 컴파일 에러
		//char var2 = "홍길동"; // 컴파일 에러
		//char var3 = ''; // 컴파일 에러
		char var4 = ' '; // 공백 하나를 포함해서 초기화
		String var5 = "A";
		String var6 = "홍길동";
		String var7 = ""; // 빈 문자열도 가능
	
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.println("나는\n");
		System.out.println("자바를\n");
		System.out.println("배웁니다.");
		
	}
}
