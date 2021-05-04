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
			  System.out.println("Ho�geldin "+user.getFirstName()+ " kimlik do�rulama ba�ar�l�,kay�t olundu.");
		  }
		  else {
			  System.out.println("Kimlik do�rulama ba�ar�s�z,kay�t olunamad�.");
		  }
		
	}

	@Override
	public void update(User user) {
		if(userCheckService.checkIfRealPerson(user)) {
			
			add(user);
			  System.out.println("Merhaba "+user.getFirstName()+ " bilgiler g�ncellendi.");
		  }
		  else {
			  System.out.println("Kimlik do�rulama ba�ar�s�z, g�ncellenemedi.");
		  }
		
	}

	@Override
	public void delete(User user) {
		if(userCheckService.checkIfRealPerson(user)) {
			
			add(user);
			  System.out.println("Merhaba "+user.getFirstName()+ " silme i�lemi tamamland�.");
		  }
		  else {
			  System.out.println("Kimlik do�rulama ba�ar�s�z,silme i�lemi yap�lamad�.");
		  }
		
	}

}
