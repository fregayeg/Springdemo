import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fre.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
		// TODO: Call the AppConfig file that uses Java and annotations
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
	
		// TODO: get the bean from the applicationContext object
		CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
		
		System.out.println(service);
		
		//TODO: test singleton scope on 2 instances of CustomerService
		// TODO: get the bean from the applicationContext object
				CustomerService service2 = applicationContext.getBean("customerService", CustomerService.class);
				
				System.out.println(service2);
		// Output:com.pluralsight.service.CustomerServiceImp@15d9bc04
		//		  com.pluralsight.service.CustomerServiceImp@15d9bc04
		// means: same instance
				
		//CustomerService customerService = new CustomerServiceImp();
		// TODO: Get the data from the repository and service
		System.out.println(service.findAll().get(0).getFirstName());
		
	}

}
