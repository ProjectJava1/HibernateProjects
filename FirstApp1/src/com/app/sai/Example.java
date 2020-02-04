package com.app.sai;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Example {
	

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		Employee e=new Employee();
                e.setEId(1001);
                e.setEName("Sai");
                e.setEFee(1000.41);
                e.setCourse("hibernate");
                
                ses.save(e);
	            tx.commit();
		        ses.close();
	}
	

}

