package de.itgain.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenshiftApplication {

	public static void main(String[] args) {
		System.out.println("Server is running on port 8080. Visit http://localhost:8080");
		SpringApplication.run(OpenshiftApplication.class, args);
	}

}
