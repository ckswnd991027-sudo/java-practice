package com.office.classex02;

public class MainClass {

	public static void main(String[] args) {
		
		Student student1 = new Student(
				"홍길동", 
				1,
				20,
				"Computer");
		Student student2 = new Student(
				"박찬호",
				1,
				21,
				"baseball");
		Student student3 = new Student(
				"박세리",
				3,
				22,
				"Golf");

		/*
		System.out.println("name: " + student1.name);
		System.out.println("grade: " + student1.grade);
		System.out.println("age: " + student1.age);
		System.out.println("major: " + student1.major);
	    */
	
		student1.printInfo();
		student2.printInfo(); 
		student3.printInfo(); 
		
		//배열
		/*
		 * 데이터타입[] 레퍼런스변수 = {아이템, 아이템, 아이템, ..};
		 */
		Student[] students = {student1, student2, student3};
		for(int i= 0; i < students.length; i++) {
			students[i].printInfo();
		}
	
		//전공이 baseball인 학생의 이름과 나이를 출력하자
		//1.전공이 baseball인 학생
		//2.이름과 나이를출력
		for (int i = 0; i < students.length; i++) {
			System.out.println("i: "  + i);
		    if (students[i].major.equals("baseball")) {          // 1. 전공이 baseball인 학생
		        System.out.println("Name: " + students[i].name); // 2. 이름과 나이 출력
		        System.out.println("Age: " + students[i].age);
		        break;
		    }
		}
	
	
	}

}
