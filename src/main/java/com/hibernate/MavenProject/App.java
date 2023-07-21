package com.hibernate.MavenProject;

import java.util.Date;

import java.util.Iterator;
import java.util.List;

import javax.persistence.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.*;
  


public class App {
	public static void main(String[] args) throws IOException {

		System.out.print("my new project");
		Configuration c = new Configuration();
		c.configure();
		SessionFactory factory = c.buildSessionFactory();
		// creating student1 class object
		Student1 s = new Student1();
		s.setId(1132);
		s.setName("shoed ahmed");
		s.setAddress("khalilabaad");

		// creating studentAddress class object
		FileInputStream file = new FileInputStream("src/main/java/download.jpeg");
		byte[] data = new byte[file.available()];
		file.read(data);
		StudentAddress add = new StudentAddress();
		add.setStudentId(1221);
		add.setAdedDate(new Date());
		add.setCity("mumbai");
		add.setStreet("tilak nagar");
		add.setCityIsOpen(true);
		add.setAdedDate(new Date());
		add.setY(1234.124);
		add.setImage(data);
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(s);

		int i = (Integer) session.save(add);
		if (i > 0)
			System.out.println("value inserted");
		else {
			System.out.println("value not inserted");
		}
		session.persist(add);

		Transaction tx = session.beginTransaction(); // tx.commit();

		Query q = session.createQuery("select studentId,street,city from StudentAddress");
		List<StudentAddress> l = q.getResultList();
		Iterator i1 = l.listIterator();
		while (i1.hasNext()) {
			Object student[] = (Object[]) i1.next();
			System.out.println(student[1]);
			System.out.println(student[2]);
		}

		Query q1 = session.createQuery("delete from StudentAddress where id=4");
		int in = q1.executeUpdate();
		if (in > 0)
			System.out.println("deleted");
		else
			System.out.println("not deleted");
		Query q2 = session.createQuery("from StudentAddress");

		List<StudentAddress> li = q2.getResultList();
		Iterator it = li.iterator();
		while (it.hasNext()) {
			StudentAddress a = (StudentAddress) it.next();
			System.out.println(a.getCity());
			System.out.println(a.getStreet());

		}
		t.commit();
	}
}
