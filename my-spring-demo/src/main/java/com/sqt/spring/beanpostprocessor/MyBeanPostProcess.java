package com.sqt.spring.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-23 11:21
 */
public class MyBeanPostProcess implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("==========> 执行了自定义的 MyBeanPostProcess 的 postProcessBeforeInitialization() 方法 ");
		if (bean instanceof User){
			User user = (User)bean;
			user.setName("Listener");
			return user;
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("==========> 执行了自定义的 MyBeanPostProcess 的 postProcessAfterInitialization() 方法 ");
		return bean;
	}
}
