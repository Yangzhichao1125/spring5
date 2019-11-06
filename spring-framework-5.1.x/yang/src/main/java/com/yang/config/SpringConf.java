package com.yang.config;

import com.yang.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This is Description
 *
 * @author yang
 * @date 2019/11/06
 */
@Configuration
public class SpringConf {

	@Bean
	public Student getStudent(){
		Student student = new Student();
		student.setName("杨");
		student.setAge(20);
		return student;
	}
}
