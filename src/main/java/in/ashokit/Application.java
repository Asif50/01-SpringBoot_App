package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// this above annotation represent 3 annotation
// @SpringBootConfiguration : it Represents java class as config class
// @EnableAutoConfiguration : to load auto configurer classes
// @ComponentScane : To identify spring beans available in the project
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
