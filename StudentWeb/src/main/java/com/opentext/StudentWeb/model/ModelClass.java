package com.opentext.StudentWeb.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opentext.StudentWeb.Studentdto.StudentInfo;

public class ModelClass {

	public void pass(StudentInfo st) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(StudentInfo.class);
		System.out.println("tyuil");

		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();

		Transaction t = s.beginTransaction();

		s.saveOrUpdate(st);
		t.commit();
	}// End of pass()
}// End of Class
