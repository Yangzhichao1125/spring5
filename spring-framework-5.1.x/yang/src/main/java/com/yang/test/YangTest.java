package com.yang.test;

import com.yang.bean.Student;
import com.yang.bean.UserEntity;
import com.yang.config.SpringConf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This is Description
 *
 * @author yang
 * @date 2019/11/06
 */
public class YangTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConf.class);
		Student bean = context.getBean(Student.class);
		UserEntity user = context.getBean(UserEntity.class);
		System.out.println("bean = " + bean);
		System.out.println("user = " + user);
	}

}
