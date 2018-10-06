
//import com.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fre.service.CustomerService;
import com.fre.service.CustomerServiceImp;

/**
 * 
 * Run the application
 * 
 * @author fre
 */
public class Application {

	public static void main(String[] args) {

		// TODO 2: Import our applicationContext.xml file
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// TODO 3: Use CustomerServiceImp bean from applicationContext instead of
		// instantiating using "new" keyword
		CustomerService service = applicationContext.getBean("customerService", CustomerServiceImp.class);

		// TODO 1: make a service instance with "new" keyword and then call data from
		// the repository
		// CustomerService customerService = new CustomerServiceImp(); // deprecated
		
		//TODO 4: make a singleton scope in applicationContext file and test it here
		//System.out.println(service);
		//CustomerService service2 = applicationContext.getBean("customerService", CustomerServiceImp.class);
		//System.out.println(service2);
		//outputs: com.fre.service.CustomerServiceImp@4b952a2d/
		//		   com.fre.service.CustomerServiceImp@4b952a2d
			
		//TODO 5: make a prototype scope in applicationContext file and test it here
		System.out.println(service);
		CustomerService service2 = applicationContext.getBean("customerService", CustomerServiceImp.class);
		System.out.println(service2);
		//outputs: com.fre.service.CustomerServiceImp@3159c4b8
		//		   com.fre.service.CustomerServiceImp@73846619
		// Means: not same instance per request
		
		// TODO LAST: show data
		System.out.println(service.findAll().get(0).getFirstName()); // show data

	}

}
