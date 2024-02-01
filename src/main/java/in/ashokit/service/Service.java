package in.ashokit.service;

import org.springframework.stereotype.Component;

// this class in the sub package of base package
// base class is the class that have start class
// the base package is in.ashokit
// @Component is scan for the java bean classes throughout 
// the project by following the pattern of base class to sub classes

@Component
public class Service {

	public Service() {
		System.out.println("Service :: Constructor");
	}
	
}
