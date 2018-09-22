//import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImp;

public class Application {

	public static void main(String[] args) {
		
		//TODO: make an service instance and call data from repository
		
		CustomerService customerService = new CustomerServiceImp();
		System.out.println(customerService.findAll().get(0).getFirstName());
		
	}

}
