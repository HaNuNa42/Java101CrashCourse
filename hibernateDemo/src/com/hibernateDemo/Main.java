package com.hibernateDemo;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration() // session factory konfig�rasyonunu yap�yoruz.
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();

		//Session asl�nda Unit of Work tasar�m deseninin uygulanm�� halidir.
		Session session = factory.getCurrentSession(); // sessionfactory de bir oturum almam�z gerek session olu�turuyoruz.
		try {
			session.beginTransaction(); // transaction.a ba�layaca��m�z� s�yl�yoruz

			//HQL - Hibernate Query Language
			//select * from city
			// List<City> cities = session.createQuery("from City").getResultList(); //sonucu list olarak d�nd�rece�inden getresultlist metodu ile d�nd�r�yoruz. listeyi bas anlam�nda kullan�l�r.
			// List<City> cities = session.createQuery("from City c where c.countryCode='TUR' OR c.countryCode='USA'").getResultList(); //c diye bir alias b�rakt�k istedi�imiz harfi b�rakabiliriz. Hibernate ko�ullu sorgular yazaca��m�zda alias ile �al���r.
			// List<City> cities = session.createQuery("from City c where c.countryCode='TUR' AND c.district='Konya'").getResultList();
			// List<City> cities = session.createQuery("from City c where c.name LIKE '%kar%'").getResultList();
			//ASC - Ascending yani a.dan z.ye s�ralama. Order by'�n default olan hali asc.dir. DESC - Descending yani z.den a.ya s�ralama
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
//			city.setDistrict("i� anadolu");
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
			
			
			
			
			session.getTransaction().commit(); // mevcut olan bu transaction.u veritaban�na commit et yani bas diyoruz.
			System.out.println("�ehir silndi");
			
		} finally {
			factory.close(); // sessionfactory.mizi kapat�yoruz
		}
	}
}
