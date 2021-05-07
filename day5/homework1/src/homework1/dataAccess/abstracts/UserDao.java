package homework1.dataAccess.abstracts;

import java.util.ArrayList;


import homework1.entities.concretes.User;

public interface UserDao {

	void register(User user);
	void login(User user);
	ArrayList<String> getAllEmails();
}
