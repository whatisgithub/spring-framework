package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Enumeration;

/**
 * @author qiangge
 */
public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
		Person person = (Person)ac.getBean("person");

		System.out.println(person.getAge());
	}

}
