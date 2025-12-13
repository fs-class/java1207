package ch06.Ex13.package1;

public class A2 {
	//필드 선언
	A2 a1 = new A2(true);
	A2 a2 = new A2(1);
	A2 a3 = new A2("문자열");

	//public 접근 제한 생성자 선언
	public A2(boolean b) {
	}

	//default 접근 제한 생성자 선언
	A2(int b) {
	}

	//private 접근 제한 생성자 선언
	private A2(String s) {
	}


	//public 접근 제한을 갖는 필드 선언
	public int field1;
	//default 접근 제한을 갖는 필드 선언
	int field2;
	//private 접근 제한을 갖는 필드 선언
	private int field3;

	//생성자 선언
	public A2() {
		field1 = 1; 		//o
		field2 = 1; 		//o
		field3 = 1; 		//o

		method1(); 			//o
		method2(); 			//o
		method3(); 			//o
	}

	//public 접근 제한을 갖는 메소드 선언
	public void method1() {
	}

	//default 접근 제한을 갖는 메소드 선언
	void method2() {
	}

	//private 접근 제한을 갖는 메소드 선언
	private void method3() {
	}
}
