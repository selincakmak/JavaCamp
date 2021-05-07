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
		
		User selin=new User(1,"Selin", "Çakmak","s@gmail.com" ,"selin123");
		User eylül=new User(2, "Eylül", "Sare","e@gmail.com", "eylül123");
		User z= new User(3, "ze","sude","e@gmail.com","123456");
		
		UserService userService=new UserManager(new DbUserDao(),new EmailManager(),new ValidationManager(),new googleAuthManagerAdapter() );		
		System.out.println("Kullanýcý kayýt:");
		userService.register(selin);
		System.out.println("------------------------------------");
		userService.register(eylül);
		System.out.println("------------------------------------");
		userService.register(z);
		System.out.println("------------------------------------");
		
		
		System.out.println("Kullanýcý giriþ:");
		userService.login(selin, "s@gmail.com", "selin123");
		System.out.println("------------------------------------");
		userService.login(eylül, "e@gmail.com", "123");
		System.out.println("------------------------------------");
	}
	
		
}
