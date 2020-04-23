package com.sqt.spring.ioc;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-03-31 10:18
 */
public class BeanDefinitionTest {

	public static void main(String[] args) {
		String location = "classpath*:META-INF/spring-ioc.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(location);
		Resource contextResource = applicationContext.getResource(location);
		Home home = applicationContext.getBean("home",Home.class);
		System.out.println(home);



		ClassPathResource resource = new ClassPathResource(location);
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);

		MyApplicationAware applicationAware = (MyApplicationAware) factory.getBean("myApplicationAware");
		applicationAware.display();
	}
}
