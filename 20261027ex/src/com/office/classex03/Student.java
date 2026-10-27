package com.office.classex03;

public class Student {
	//속성
	int studentNo;
	String studentName;
	
	
	//속성자
	public Student() {
		System.out.println("^^");
	}
	//메서드
	public void printInfo() {
		System.out.println("studentNo: "+ studentNo);
		System.out.println("studentName: "+ studentName);
	}

}
