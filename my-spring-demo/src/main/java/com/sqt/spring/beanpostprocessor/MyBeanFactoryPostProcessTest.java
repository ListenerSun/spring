package com.sqt.spring.beanpostprocessor;

import com.sqt.spring.ioc.Home;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-23 11:22
 */
public class MyBeanFactoryPostProcessTest {

	public static void main(String[] args) {

		String[] locations = {"classpath*:META-INF/spring-beanpostprocessor.xml"};
		testBeanPostProcess(locations);

	}

	private static void testBeanPostProcess(String[] locations) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
		int number = xmlBeanDefinitionReader.loadBeanDefinitions(locations);
		beanFactory.addBeanPostProcessor(new MyBeanPostProcess());
		User user = beanFactory.getBean(User.class);
		System.out.println(user);
	}
}
