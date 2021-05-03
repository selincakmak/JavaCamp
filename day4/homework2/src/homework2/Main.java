package homework2;

import java.time.LocalDate;

import homework2.Abstract.BaseCustomerManager;
import homework2.Adapters.MernisServiceAdapter;
import homework2.Concrete.StarbuckCustomerManager;
import homework2.Entities.Customer;


public class Main {

	public static void main(String[] args) {

	 BaseCustomerManager customerManager=new StarbuckCustomerManager(new MernisServiceAdapter());
	 Customer customer1=new Customer(1," Havva Selin","Çakmak", LocalDate.of(1998,11,19),"12345678910");
	 customerManager.save(customer1);

	}

}
