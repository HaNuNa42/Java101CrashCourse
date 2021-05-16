package com.hibernateDemo;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration() // session factory konfigürasyonunu yapýyoruz.
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();

		//Session aslýnda Unit of Work tasarým deseninin uygulanmýþ halidir.
		Session session = factory.getCurrentSession(); // sessionfactory de bir oturum almamýz gerek session oluþturuyoruz.
		try {
			session.beginTransaction(); // transaction.a baþlayacaðýmýzý söylüyoruz

			//HQL - Hibernate Query Language
			//select * from city
			// List<City> cities = session.createQuery("from City").getResultList(); //sonucu list olarak döndüreceðinden getresultlist metodu ile döndürüyoruz. listeyi bas anlamýnda kullanýlýr.
			// List<City> cities = session.createQuery("from City c where c.countryCode='TUR' OR c.countryCode='USA'").getResultList(); //c diye bir alias býraktýk istediðimiz harfi býrakabiliriz. Hibernate koþullu sorgular yazacaðýmýzda alias ile çalýþýr.
			// List<City> cities = session.createQuery("from City c where c.countryCode='TUR' AND c.district='Konya'").getResultList();
			// List<City> cities = session.createQuery("from City c where c.name LIKE '%kar%'").getResultList();
			//ASC - Ascending yani a.dan z.ye sýralama. Order by'ýn default olan hali asc.dir. DESC - Descending yani z.den a.ya sýralama
			//List<City> cities = session.createQuery("from City c ORDER BY c.name ASC").getResultList();
			
			/*for(city:cities) {
				System.out.println(city.getName());
			}*/
			
			/*
			  List<String> countryCodes = session.createQuery("select c.countryCode from City c GROUP BY c.countryCode").getResultList();
			  
			  for(String countryCode:countryCodes) { System.out.println(countryCode); }
			 */
			
			
			
			//INSERT 
//			City city = new City();
//			city.setName("konya 5");
//			city.setCountryCode("TUR");
//			city.setDistrict("iç anadolu");
//			city.setPopulation(50000000);
//			session.save(city);
			
			
			//UDPATE
//			City city = session.get(City.class, 4084);
//			city.setPopulation(4000);
//			System.out.println(city.getName());
//			session.save(city);
			
			
			//DELETE
			City city = session.get(City.class, 4084);
			session.delete(city);
			
			
			
			
			session.getTransaction().commit(); // mevcut olan bu transaction.u veritabanýna commit et yani bas diyoruz.
			System.out.println("þehir silndi");
			
		} finally {
			factory.close(); // sessionfactory.mizi kapatýyoruz
		}
	}
}
