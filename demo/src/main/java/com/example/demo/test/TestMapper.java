package com.example.demo.test;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {
	@Select("select * from member")
	List<TestDTO>getTestList();
	
	@Insert("insert into member(projectno,email,pwd) values(seq_member_idx.nextVal, #{email}, #{pwd})")
	int saveuser(
			@Param("projectno") int projectno,
			@Param("email") String email, 
			@Param("pwd") String pwd
			);
}

