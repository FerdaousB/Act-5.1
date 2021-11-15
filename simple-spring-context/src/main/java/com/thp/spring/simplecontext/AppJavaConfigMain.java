package com.thp.spring.simplecontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppJavaConfigMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppMoussaillonConfig.class);
		Moussaillon m = new Moussaillon();
		m = (Moussaillon) context.getBean("moussaillon") ;
		System.out.println("Le prénom du moussaillon : " + m.getFirstName());
		System.out.println("Le nom du moussaillon : " + m.getLastName());
		System.out.println("Configuration utilisée : " + m.getConfig());
	}

}
