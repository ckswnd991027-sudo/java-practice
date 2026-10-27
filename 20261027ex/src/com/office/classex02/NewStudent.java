package com.office.classex02;

public class NewStudent {

	//멤버 필드
	int grade;                       //학년
	int classNo;                     //반번호 
	int studentNo;                   //학생번호
	String studentName;              //학생이름
	boolean absence = false;                //휴학구분
	
	/*
	 * 생성자 오버로딩이란, 생성자가(과적)넘친다는 의미이다.
	 */
	//생성자
	public NewStudent(int classNo, int studentNo,String studentName) {
System.out.println("---CONSTRUCTOR---");

this.classNo = classNo;
this.studentNo = studentNo;
this.studentName = studentName;
}   
	public NewStudent(int grade, int classNo, int studentNo,String studentName) {
System.out.println("---CONSTRUCTOR---");
this.grade = grade;
this.classNo = classNo;
this.studentNo = studentNo;
this.studentName = studentName;
}   
	public NewStudent(int grade, int classNo, int studentNo,String studentName, Boolean absence) {
		System.out.println("---CONSTRUCTOR---");
		this.grade = grade;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName; 
		this.absence = absence;
		}   
	//메서드
	public void printInfo() {
		System.out.println("학년: " + grade);
		System.out.println("반번호: " + classNo);
		System.out.println("학생 개인 번호: " + studentNo);
		System.out.println("학생 이름: " + studentName);
		System.out.println("휴학 구분: "+ absence);
	}
}
