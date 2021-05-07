package homework1.business.abstracts;

import java.util.ArrayList;

import homework1.entities.concretes.User;

public interface ValidationService {
	boolean passwordIsValid(User user);
	boolean emailIsValid(User user, ArrayList<String>emails);
	boolean firstNameIsValid(User user);
	boolean lastNameIsValid(User user);
	
}
