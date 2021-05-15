package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); //konfigürasyon xml ile bean oluþturup classý newlemeden sistemler arasý geçiþ yapmak için kullanýyoruz. Bu kýsýmda xml dosyamýzý kuyabilmek için class path tanýmlamýþ olduk

		ICustomerService customerService = context.getBean("service", ICustomerService.class);
		customerService.add();

	}

	// IoC - Inversion of Control yapýyý ayaða kaldýran tasarým desenine;
	// Dependency Injection'dur.

}
