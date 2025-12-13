package ch07.ex09_추상클래스;

public class AbstractMethodMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();

		Cat cat = new Cat();
		cat.sound();

		//매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());

	}
	
	// Animal animal = new Dog(); -> 자동 타입 변환
	public static void animalSound( Animal animal ) {
		// 재정의된 메서드 호출
		animal.sound();
	}

}
