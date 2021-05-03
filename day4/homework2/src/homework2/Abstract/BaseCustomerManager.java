package homework2.Abstract;

import homework2.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("saved to db :"+ customer.getFirstName());
		
	}

}
