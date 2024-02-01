package in.ashokit;

import org.springframework.stereotype.Component;

@Component
//above annotation represent that the java class is Java bean
// java beans are handle by the IoC
// IoC will create object only for java beans classes
public class UserDao {
	
	public UserDao() {
		System.out.println("UserDao :: Constructor");
	}
	
}
