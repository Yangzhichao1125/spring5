package com.yang.bean;

import org.springframework.stereotype.Component;

/**
 * This is Description
 *
 * @author yang
 * @date 2019/11/06
 */
@Component
public class Student {

	public Student(final String name, final int age) {
		this.name = name;
		this.age = age;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	private String name;
	private int age;

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(final int age) {
		this.age = age;
	}
}
