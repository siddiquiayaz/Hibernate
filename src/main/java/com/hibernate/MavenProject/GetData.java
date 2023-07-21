package com.hibernate.MavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetData {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		StudentAddress student_address = (StudentAddress) session.get(StudentAddress.class, 1);
		System.out.println(student_address);

		factory.close();
		session.close();

	}
}
