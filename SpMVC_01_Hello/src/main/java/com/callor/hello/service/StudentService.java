package com.callor.hello.service;

import org.springframework.stereotype.Service;

import com.callor.hello.model.StudentDto;

// Spring에게 미리 만들어놓으라고 선언
@Service
public class StudentService {
	
	public StudentDto getStudent() {
	// builder : Dto 에 있는 변수의 이름으로 직접 값을 넣을 수 있음.
		/*
		 * Builder pattern
		 * Dto 객체를 생성하고, setter() method 를 사용하여
		 * 		StudentDto stDto = new StudentDto()
		 * 각 속성(변수)에 값을 세팅하는 기존의 코드를 사용하지 않고
		 * 		stDto.setStNum("0001");
		 * 
		 * builder() method 를 통하영 객체를 사용하면서
		 * 변수의 이름을 method 처럼 사용하여 값을 세팅하는 코딩 스타일
		 * */
		StudentDto stDto = StudentDto.builder()
				.stNum("0001")
				.stName("홍길동")
				.stDept("정보통신")
				.build();
		return stDto;
	}
	
	
}
