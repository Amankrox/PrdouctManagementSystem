package com.Product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ProductEntity.Product;
@Configuration
@ComponentScan(basePackages = "com.Product")
public class App {
	ApplicationContext ac=new AnnotationConfigApplicationContext();
	Product p1=new Product();

}
