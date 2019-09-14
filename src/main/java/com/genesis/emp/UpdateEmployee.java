package com.genesis.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {

	public static void main(String[] args) {
			

		Employee e1=new Employee(1,"Faizal",5000);
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();

		session.update(e1);
		
		tr.commit();
		
		session.close();
		
		System.out.println("Data Updated");
		
		
		
	}

}
