package homework1;


import homework1.business.abstracts.UserService;
import homework1.business.concretes.EmailManager;
import homework1.business.concretes.UserManager;
import homework1.business.concretes.ValidationManager;
import homework1.core.googleAuthManagerAdapter;
import homework1.dataAccess.concretes.DbUserDao;
import homework1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User selin=new User(1,"Selin", "�akmak","s@gmail.com" ,"selin123");
		User eyl�l=new User(2, "Eyl�l", "Sare","e@gmail.com", "eyl�l123");
		User z= new User(3, "ze","sude","e@gmail.com","123456");
		
		UserService userService=new UserManager(new DbUserDao(),new EmailManager(),new ValidationManager(),new googleAuthManagerAdapter() );		
		System.out.println("Kullan�c� kay�t:");
		userService.register(selin);
		System.out.println("------------------------------------");
		userService.register(eyl�l);
		System.out.println("------------------------------------");
		userService.register(z);
		System.out.println("------------------------------------");
		
		
		System.out.println("Kullan�c� giri�:");
		userService.login(selin, "s@gmail.com", "selin123");
		System.out.println("------------------------------------");
		userService.login(eyl�l, "e@gmail.com", "123");
		System.out.println("------------------------------------");
	}
	
		
}
