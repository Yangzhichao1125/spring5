package com.yang.myProcessor;

import com.yang.bean.Student;
import com.yang.bean.UserEntity;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 实现BeanPostProcessor 可以实现对spring对扩展
 * 拿到对应对bean，可以对其进行代理等操作
 *
 * @author yang
 * @date 2019/11/07
 */
@Component
public class TestProcessor2 implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("userEntity")){
			System.out.println(beanName);
			UserEntity userEntity = (UserEntity) bean;
			userEntity.setId(12);
			userEntity.setName("user");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
}
