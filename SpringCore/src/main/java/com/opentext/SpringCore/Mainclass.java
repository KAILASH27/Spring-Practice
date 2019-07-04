package com.opentext.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opentext.SpringCore.Beans.TextEditor;

public class Mainclass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		TextEditor t1 = (TextEditor) context.getBean("texteditor");

		System.out.println(t1.getName());
		t1.getSpellcheck().checkSpelling();

		((AbstractApplicationContext) context).close();

	}// End Main Method

}// End Class
