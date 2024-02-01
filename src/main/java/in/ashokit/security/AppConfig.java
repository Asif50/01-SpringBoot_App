package in.ashokit.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// if you want to create the object of class by own
// for security purpose you don't write the @Component
// Instead of @Component annotation there is @Configuration annotation
// that annotation tells that this is java bean class as well as
// it tells it is a java bean class having a bean method because
// @Bean annotation is used above the method 
// @Bean is method level annotation
// using @Bean annotation the IoC will not create that object its own
// when we need then it create the object

@Configuration
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig :: Constructor");
	}
	
//	@Bean
//	public AppSecurity createSecurityObj() {
//		AppSecurity as = new AppSecurity("SHA-256");
//		return as;
//	}
	
}
