package com.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // bunun bir config dosyas� oldu�unu belirtiyoruz
@ComponentScan("com.springDemo") // hangi componenti taramas� gerekti�ini yaz�yoruz
@PropertySource("classpath:values.properties")
public class IocConfig {

	// xml dosyas� yerine config dosyas� ile konfig�rasyon yap�ld�. tek bir dosyadan
	// database anahtar kelimesini tan�mlayarak kontrol edilmesini daha kolay hale
	// getirdik.
	@Bean
	public ICustomerDal database() {
		return new MsSqlCustomerDal();
	}

	@Bean
	public ICustomerService service() {
		return new CustomerManager(database());
	}
}
