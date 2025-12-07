package ch02;

/**
 * Java 13부터
 * 	텍스트 블록 문법
 *		String str = """ ... """;
 *		큰 따옴표 3개(""")로 감싸면 작성된 그대로 문자열로 저장된다.
 * Java 14부터
 * 		줄바꿈을 하지 않고 다음 줄에 이어서 작성하고 싶다면 맨 끝에 \를 붙여 준다.
 */
public class Ex09_텍스트블록문법 {
	public static void main(String[] args) {
		String str1 = "" +
				"{\n" +
				"\t\"id\":\"winter\",\n" +
				"\t\"name\":\"눈송이\"\n" +
				"}";
		
		String str2 = """
				{
					"id":"winter",
					"name":"눈송이"
				}
				""";
		
		System.out.println(str1);
		System.out.println("------------------------");
		System.out.println(str2);
		System.out.println("------------------------");
		String str = """
				나는 자바를 \
				학습합니다.
				나는 자바 고수가 될 것입니다.
				""";
		System.out.println(str);
		
	}
}
