package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); //konfig�rasyon xml ile bean olu�turup class� newlemeden sistemler aras� ge�i� yapmak i�in kullan�yoruz. Bu k�s�mda xml dosyam�z� kuyabilmek i�in class path tan�mlam�� olduk

		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		customerService.add();

	}

	// IoC - Inversion of Control yap�y� aya�a kald�ran tasar�m desenine;
	// Dependency Injection'dur.

}
