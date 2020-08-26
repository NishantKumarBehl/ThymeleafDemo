package com.mylearning.demoThyme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Component Scan not required but since i didn't follow the package scope, its a must
@SpringBootApplication
@ComponentScan(basePackages={"com.mylearning"})
public class DemoThymeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoThymeApplication.class, args);
	}

}
