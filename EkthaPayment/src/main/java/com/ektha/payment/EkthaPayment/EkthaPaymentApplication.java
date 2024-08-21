package com.ektha.payment.EkthaPayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EkthaPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EkthaPaymentApplication.class, args);
	}

}
