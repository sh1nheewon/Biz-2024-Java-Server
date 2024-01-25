package com.callor.hello.models;

public class StudentDto {
	// Spring Project 에서는 Dto 클래스의 속성(변수, 멤버)는
	// Private 으로 선언한다.
	private String stNum;
	private String stName;
	private String stGrade;
	
	/* alt + shift + s 
	 *  1. Generate getter & setter 로 생성
	 *  2. G toString
	 *  3. 생성자 만들기
	 *  4. G constructor using fields 
	 * */ 
	
	// 3.
	public StudentDto() {
		// TODO Auto-generated constructor stub
	}
	
	
	// 4.
	public StudentDto(String stNum, String stName, String stGrade) {
		super();
		this.stNum = stNum;
		this.stName = stName;
		this.stGrade = stGrade;
	}

	// 1.
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStGrade() {
		return stGrade;
	}
	public void setStGrade(String stGrade) {
		this.stGrade = stGrade;
	}
	

		
}
