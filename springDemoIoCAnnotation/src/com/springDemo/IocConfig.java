package com.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // bunun bir config dosyasý olduðunu belirtiyoruz
@ComponentScan("com.springDemo") // hangi componenti taramasý gerektiðini yazýyoruz
@PropertySource("classpath:values.properties")
public class IocConfig {

	// xml dosyasý yerine config dosyasý ile konfigürasyon yapýldý. tek bir dosyadan
	// database anahtar kelimesini tanýmlayarak kontrol edilmesini daha kolay hale
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
