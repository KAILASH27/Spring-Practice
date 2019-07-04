package com.opentext.Spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opentext.Spring.Beans.StudentBean;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students: ");
		int num = sc.nextInt();
		StudentBean str[] = new StudentBean[num];

		for (int i = 0; i < num; i++) {
			StudentBean s1 = (StudentBean) context.getBean("studentbean");
			System.out.println("Enter the name:");
			String name = sc.next();
			s1.setName(name);
			System.out.println("Enter the rollnumber:");
			String rollno = sc.next();
			s1.setRollno(rollno);
			System.out.println("Enter the mobile number:");
			long mobileno = sc.nextLong();
			s1.setMobileno(mobileno);
			System.out.println("Enter the email id:");
			String emailid = sc.next();
			s1.setEmailid(emailid);
			System.out.println("Enter the gender:");
			String gender = sc.next();
			s1.setGender(gender);
			str[i] = s1;
		}
		sc.close();
		for (int j = 0; j < num; j++) {
			System.out.println("Student " + (j + 1) + " details");
			System.out.println("Name: " + str[j].getName());
			System.out.println("Rollno: " + str[j].getRollno());
			System.out.println("Mobileno: " + str[j].getMobileno());
			System.out.println("EmailId: " + str[j].getEmailid());
			System.out.println("Gender: " + str[j].getGender());
		}
		((AbstractApplicationContext) context).close();

	}// End Main method

}// End class
