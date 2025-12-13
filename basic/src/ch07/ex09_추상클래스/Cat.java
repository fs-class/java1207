package ch07.ex09_추상클래스;

public class Cat extends Animal {
	//추상 메서드 재정의
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
