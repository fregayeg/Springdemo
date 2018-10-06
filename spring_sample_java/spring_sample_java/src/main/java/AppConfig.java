import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * Configuration file
 * 
 * @author fre
 *
 */
@Configuration
@ComponentScan("com.pluralsight") // scan for autowiring
public class AppConfig {
	
	/*
	@Bean(name="customerService")
	public CustomerServiceImp getCustomerService() {
		//return new CustomerServiceImp();
		
		//TODO: use setter injection
		//CustomerServiceImp service = new CustomerServiceImp();
		//service.setCustomerRepository(getCustomerRepository());
		
		//TODO: use constructor injection
		//CustomerServiceImp service = new CustomerServiceImp(getCustomerRepository());
		
		CustomerServiceImp service = new CustomerServiceImp();
		//service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	*/
	/*
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepository();
	}
	*/
}
