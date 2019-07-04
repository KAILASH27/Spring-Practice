package com.opentext.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opentext.Spring.Beans.MessageBean;

public class Main1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		MessageBean m1 = (MessageBean) context.getBean("messagebean");

		System.out.println(m1.getMessage());

		((AbstractApplicationContext) context).close();

	}// End Main Method

}// End Class
