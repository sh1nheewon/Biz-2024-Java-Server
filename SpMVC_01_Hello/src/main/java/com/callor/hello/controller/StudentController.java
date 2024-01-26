package com.callor.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.callor.hello.model.StudentDto;

// @@@ controller 생성 후 requestMapping 을 만들어주면 자동으로 router 가 된다.

@Controller
@RequestMapping(value="/student")
public class StudentController {
	
	private String viewURL = "student/%s";
	
	/*
	 *  "/student/" 또는 "/student" 로 요청이 되면
	 *  value 를 배열로 만들어서 두 가지 상황에서 작동되도록 만들어준다. ( {,} )
	 */
	@RequestMapping(value={"/",""}, method=RequestMethod.GET)
	public String list() {
		return String.format(viewURL, "list");
		// viewURL + "list" 를 붙여서 보여주기
	}
	
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public String insert() {
		return String.format(viewURL, "insert");
	}
	
	/*
	 * form 의 input box 에 입력된 데이터(문자열)는 
	 * controller method 의 매개변수와 1:1 로 매칭된다.
	 * 이때 input box 의 name 속성은 Dto 클래스의 변수명과 일치해야 한다.
	 * 
	 * @ResponseBody
	 * method 문자열을 return 하면 원래는 views/*.jsp 파일을 찾아서 
	 * rendering 한 후 client 로 보낸다. 
	 * 하지만 @ResponseBody 가 설정되면,
	 * 문자열을 Http 프로토콜의 Response 영역에 그대로 실어서 client 로 보낸다.
	 * 
	 */
	
	// Setter 가 없으면 아래 코드가 실행이 안됨
	@ResponseBody
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insert(@ModelAttribute StudentDto stDto) { // Dto 매개변수 설정해야됨
		System.out.println(stDto.toString());
		return stDto.toString();
		// input form 에서 입력한 값을 가지고
		// controller 에서 studentDto 라는 매개변수가 있으면 변수 확인. 후 변수 값을 세팅
		// router 에서 문자열을 return 하면 views 폴더에서 이름에 맞는 jsp 파일을 보냄.
		// stDto 를 /insert 화면에 responseBody 로 요청 (toString - render 가 아닌 문자열 그대로 return)
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update() {
		return String.format(viewURL, "update");
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update(StudentDto stDto) {
		return "redirect:/detail";
	}
	
	@RequestMapping(value=".detail", method=RequestMethod.GET)
	public String detail(String stNum) {
		return String.format(viewURL, "detail");
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete() {		
		// "/student" URL 로 화면을 전환하라.
		return "redirect:/student";
	}
	
}
