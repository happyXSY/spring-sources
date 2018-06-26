package com.spring.entity;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainClass {
	
	
	@Test
	public void testSpring() {
		BeanFactory bf=new XmlBeanFactory(new ClassPathResource("ioc.xml"));
		Employee em=(Employee)bf.getBean("employee");
		assertEquals("anhui", em.getName());
	}
	
	public void testName() throws Exception {
		ApplicationContext ioc=new ClassPathXmlApplicationContext("classpath:ioc.xml");
		Employee bean=(Employee)ioc.getBean("employee");
		System.out.println(bean);
	}

}
