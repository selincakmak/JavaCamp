package homework2.Concrete;

import homework2.Abstract.BaseCustomerManager;
import homework2.Abstract.CustomerCheckService;
import homework2.Entities.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;
	
    public StarbuckCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
    
	@Override
	public void save(Customer customer) {
	  if(customerCheckService.checkIfRealPerson(customer)) {
		 
		  save(customer);
		  System.out.println("valid person");
	  }
	  else {
		  System.out.println("not a valid person");
	  }
	}

	

	

}
