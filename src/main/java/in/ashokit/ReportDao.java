package in.ashokit;

public class ReportDao {

	// if we not write @Component annotation
	// that means that class is normal java class
	// so IoC will not create the object for that class
	
	public ReportDao() {
		System.out.println("ReportDao :: constructor");
	}
	
}
