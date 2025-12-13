package ch06.ex02_필드와생성자;

public class Car1Main2 {

	public static void main(String[] args) {
		// 매개값으로 객체의 필드를 다양하게 초기화
		Car1 car1 = new Car1();
		Car1 car2 = new Car1("자가용");
		Car1 car3 = new Car1("자가용", "빨강");
		Car1 car4 = new Car1("택시", "검정", 200);
				
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}

}
