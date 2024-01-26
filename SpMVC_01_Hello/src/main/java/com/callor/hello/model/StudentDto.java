package com.callor.hello.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/* lombok 을 이용하면 생성자를 간편하게 생성 가능
 * 변수를 private 로 선언하고 생성자 만들기 
 * */
@AllArgsConstructor
// 생성자가 있는 
@NoArgsConstructor
// 생성자가 없는
@Getter
// get 생성자
@Setter
// set 생성자
@ToString
// toString 생성자
@Builder
public class StudentDto {
	private String stNum;
	private String stName;
	private String stDept;
	private String stGrade;
	private String stTel;
	private String stAddr;

}