package com.genesis.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {

	public static void main(String[] args) {


				Employee e=new Employee();
				e.setEno(2);
				Configuration config=new Configuration().configure();
				SessionFactory sf=config.buildSessionFactory();
				Session session=sf.openSession();
				Transaction tr=session.beginTransaction();

				session.delete(e);
				
				tr.commit();
				
				session.close();
				
				System.out.println("Data Deleted");
				
				
				
				

			}

}


