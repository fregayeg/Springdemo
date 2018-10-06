import com.fre.service.CustomerService;
import com.fre.service.CustomerServiceImp;

public class Application {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerServiceImp();
		
		System.out.println(customerService.findAll().get(0).getFirstName());
		
	}

}
