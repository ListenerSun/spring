package com.sqt.spring.factory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-03-31 10:18
 */
public class BeanDefintionTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:META-INF/spring-test" +
				".xml");
		Home home = applicationContext.getBean("home",Home.class);
		System.out.println(home);
		ClassPathResource resource = new ClassPathResource("/META-INF/spring-test.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);

		MyApplicationAware applicationAware = (MyApplicationAware) factory.getBean("myApplicationAware");
		applicationAware.display();
	}
}
