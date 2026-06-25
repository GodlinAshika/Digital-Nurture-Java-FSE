package dependency_injection;

public class CustomerService{
	
	private CustomerRepository customerRepository;
	
	public CustomerService(CustomerRepository customerRepository) {
	    this.customerRepository = customerRepository;
	}
	
    public void getCustomer() {
        customerRepository.findCustomerById();
    }
}
