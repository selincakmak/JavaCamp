package thirdhomework;

public class UserManager {
	
	public void logIn(User user) {
		System.out.println(user.getFirstName()+" baþarýyla giriþ yaptýnýz.");
	}
	public void logOut(User user) {
		System.out.println(user.getFirstName()+" çýkýþ yaptýnýz.");
	}

}
