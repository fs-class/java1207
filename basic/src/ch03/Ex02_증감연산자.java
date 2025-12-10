package ch03;

public class Ex02_증감연산자 {
	public static void main(String[] args) {
        // 증감 연산자
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x=" + x); // x=12

        System.out.println("------------------------");
        y--;
        --y;
        System.out.println("y=" + y); // y=8

        System.out.println("------------------------");
        z = x++; // x를 z에 대입 후 x 1증가
        System.out.println("z=" + z); // z=12
        System.out.println("x=" + x); // x=13

        System.out.println("------------------------");
        z = ++x; // x를 1증가 후 z에 대입
        System.out.println("z=" + z); // z=14
        System.out.println("x=" + x); // x=14

        System.out.println("------------------------");
        z = ++x + y++; // x를 1증가 후 y와 더한 결과를 z에 대입 후 y 증가
        System.out.println("z=" + z); // z=23
        System.out.println("x=" + x); // x=15
        System.out.println("y=" + y); // y=9
	}
}
