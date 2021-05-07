package homework1.business.concretes;
import java.util.ArrayList;
import java.util.regex.Pattern;

import homework1.business.abstracts.ValidationService;
import homework1.entities.concretes.User;

public class ValidationManager implements ValidationService {


	
	public boolean passwordIsValid(User user) {
		if( user.getPassword().length()<6 || user.getPassword()==null){
			System.out.println("Parola en az 6 karakter olmalýdýr.");
			
			return false;
		}
		return true;
		
	}
	public boolean emailIsValid(User user, ArrayList<String> emails) {
		
		String regex ="^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		Pattern  pattern=Pattern.compile(regex);
		
		if(pattern.matcher(user.getEmail()).matches()==false) {
			System.out.println("Geçerli email adresi giriniz.");
			return false;
			
		}
		else if(emails.contains(user.getEmail())) {
			System.out.println("Email zaten var.");
			return false;
		}
		return true;
		
	}
	public boolean firstNameIsValid(User user) {
		if( user.getFirstName().length()<2){
			System.out.println("Ýsim en az 2 karakter olmalýdýr.");
			
			return false;
		}
		return true;
		
	}
	public boolean lastNameIsValid(User user) {
		if( user.getLastName().length()<2){
			System.out.println("Soyisim en az 2 karakter olmalýdýr.");
			return false;
		}
		return true;
		
	}
	

}
