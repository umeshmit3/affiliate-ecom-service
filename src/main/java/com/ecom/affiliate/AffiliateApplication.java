package com.ecom.affiliate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.ecom.affiliate"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class AffiliateApplication {

	public static void main(String[] args) {
		SpringApplication.run(AffiliateApplication.class, args);
	}
}
