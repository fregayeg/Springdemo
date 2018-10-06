import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fre.service.CustomerService;
import com.fre.service.CustomerServiceImp;

public class Application {

	public static void main(String[] args) {

		// TODO 1: Import our applicationContext.xml file
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// TODO 2: Use CustomerServiceImp bean from applicationContext annotation instead of instantiating using "new" keyword
		CustomerService service = applicationContext.getBean("customerService", CustomerServiceImp.class);
		System.out.println(service.findAll().get(0).getFirstName()); //
	}

}
