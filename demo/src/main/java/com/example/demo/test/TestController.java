package com.example.demo.test;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
private TestMapper mapper;
	
	@Autowired
	public void setMapper(TestMapper mapper) {
		this.mapper = mapper;
	}
	
	@GetMapping("/community/list/all")
	public List<TestDTO> getTestList(){
		return mapper.getTestList();
	}
	
	@PostMapping("/community/content/upload")
	
	public int insert(
			@RequestParam(value="projectno", required=false) int projectno,
			@RequestParam(value="email", required=false) String email,
			@RequestParam(value="pwd", required=false) String pwd,
			HttpServletResponse response
			)throws IOException {
	
		return mapper.saveuser(projectno,email,pwd);
	}
	
	
	
	
	
}
