package homework3.Concrete;

import homework3.Abstract.UserCheckService;
import homework3.Abstract.UserService;
import homework3.Entities.User;

public class UserManager implements UserService{

	UserCheckService userCheckService;
	
     public UserManager(UserCheckService userCheckService) {
		this.userCheckService=userCheckService;
	}
	
	@Override
	public void add(User user) {
		if(userCheckService.checkIfRealPerson(user)) {
		
			add(user);
			  System.out.println("Hoþgeldin "+user.getFirstName()+ " kimlik doðrulama baþarýlý,kayýt olundu.");
		  }
		  else {
			  System.out.println("Kimlik doðrulama baþarýsýz,kayýt olunamadý.");
		  }
		
	}

	@Override
	public void update(User user) {
		if(userCheckService.checkIfRealPerson(user)) {
			
			add(user);
			  System.out.println("Merhaba "+user.getFirstName()+ " bilgiler güncellendi.");
		  }
		  else {
			  System.out.println("Kimlik doðrulama baþarýsýz, güncellenemedi.");
		  }
		
	}

	@Override
	public void delete(User user) {
		if(userCheckService.checkIfRealPerson(user)) {
			
			add(user);
			  System.out.println("Merhaba "+user.getFirstName()+ " silme iþlemi tamamlandý.");
		  }
		  else {
			  System.out.println("Kimlik doðrulama baþarýsýz,silme iþlemi yapýlamadý.");
		  }
		
	}

}
