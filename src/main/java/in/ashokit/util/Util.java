package in.ashokit.util;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// This is also a sub class of the base class
@Component
@Scope("prototype")
// the above @Scope annotation is used for set the scope
// of the java bean class
// by default the scope of java bean class is Singleton
// that follows the eager loading
// in eager loading the IoC is create the object at the time
// when java bean class is loaded
// when we set the scope as prototype then the object is created at
// the time when we request 
//	This creates a new bean instance each time when requested
public class Util {
	public Util() {
		System.out.println("Util :: Constructor");
	}
}
