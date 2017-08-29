package com.polling.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@IntegrationComponentScan
@EnableIntegration
public class DemoApplication {

	public static void main(String[] args) {
		//System.out.println(System.getProperty("java.io.tmpdir")); C:\Users\JOONGH~1\AppData\Local\Temp\
		SpringApplication.run(DemoApplication.class, args);

	}
}
