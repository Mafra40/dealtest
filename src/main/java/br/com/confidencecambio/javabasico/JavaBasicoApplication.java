package br.com.confidencecambio.javabasico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class JavaBasicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBasicoApplication.class, args);
	}

}
