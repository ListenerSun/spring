package com.sqt.spring.annotation;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-23 15:21
 */
public class AnnotationTest {

	public static void main(String[] args) {
		String lcoation = "classpath*:META-INF/spring-annotation.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(lcoation);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		System.out.println("beanDefinitionNames:" + Arrays.toString(beanDefinitionNames));
	}
}
