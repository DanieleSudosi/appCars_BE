package com.finance.appCars;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppCarsApplication implements InitializingBean {

	public static void main(String[] args) {
		SpringApplication.run(AppCarsApplication.class, args);
	}

	@Override
	public void afterPropertiesSet() throws Exception {

	}
}
