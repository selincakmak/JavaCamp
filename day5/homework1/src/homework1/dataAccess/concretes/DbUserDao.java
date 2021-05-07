package homework1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homework1.dataAccess.abstracts.UserDao;
import homework1.entities.concretes.User;

public class DbUserDao implements UserDao{

	List<User> users;
	
	public DbUserDao() {
		users=new ArrayList<User>();
	}
	
	
	@Override
	public void register(User user) {
		users.add(user);
		System.out.println("Kullanýcý kaydedildi: "+user.getFirstName());
		
	}

	@Override
	public void login(User user) {
		System.out.println("Sisteme giriþ yapýldý.Merhaba "+ user.getFirstName());
		
	}

	public ArrayList<String> getAllEmails(){
		ArrayList<String> emails =new ArrayList<String>();
		
		for(User user : users) {
			emails.add(user.getEmail());
		}
		return emails;
	}

	




	
}
