package ch06;

public class KoreanMain {
	public static void main(String[] args) {
		//Korean 객체 생성
		Korean k1 = new Korean("박자바", "011225-1234567");
		//Korean 객체 데이터 읽기
		System.out.println("k1.nation : " + k1.nation);
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		System.out.println();

		//또 다른 Korean 객체 생성
		Korean k2 = new Korean("김자바", "930525-0654321");
		//또 다른 Korean 객체 데이터 읽기
		System.out.println("k2.nation : " + k2.nation);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		

		System.out.println("\n\n");
		//Final 필드는 값을 변경할 수 없음
//		k1.nation = "USA";
//		k1.ssn = "123-12-1234";

		//비 final 필드는 값 변경 가능
		k1.name = "홍자바";
		
		System.out.println("k1.nation : " + k1.nation);
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
	}
}
