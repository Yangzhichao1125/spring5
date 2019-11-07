package com.yang.bean;

import org.springframework.stereotype.Component;

/**
 * This is Description
 *
 * @author yang
 * @date 2019/11/07
 */
@Component
public class UserEntity {
	private int id;
	private String name;

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserEntity{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

	public void UserTest(){
		System.out.println("userTest");
	}
}
