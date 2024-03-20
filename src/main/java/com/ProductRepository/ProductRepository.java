package com.ProductRepository;

import java.util.Scanner;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ProductEntity.Product;
//import com.mysql.cj.xdevapi.SessionFactory;
//import org.springframework.context.annotation.Configuration;

public class ProductRepository {


	public void addProduct( Product p) {
		Configuration configuration=new Configuration().configure().addAnnotatedClass(Product.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		transaction.commit();
	session.save(p);
	session.close();
	}

}
