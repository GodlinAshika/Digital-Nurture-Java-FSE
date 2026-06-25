package dependency_injection;

public class CustomerRepositoryImpl implements CustomerRepository{

	@Override
	public void findCustomerById() {
		System.out.println("Customer found");
	}
}
