import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Demo {
    public static void main(String[] args) {

        CustomerService customerService= new CustomerServiceImpl();

        String firstname = customerService.findAll().get(0).getFirstname();
        System.out.println(firstname);

    }

}
