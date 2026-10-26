package com.office.classex03;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 홍길동
		 * 22
		 * 
		 * White
		 * 123가4567
		 */
		// Car car1 = new Car("White", "123가5678");
		Student student1 = new Student("홍길동", 22, new Car("White", "123가5678"));
        student1.printInfo();
	}

}
