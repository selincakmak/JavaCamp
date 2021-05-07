package homework1.business.concretes;

import homework1.business.abstracts.EmailService;
import homework1.entities.concretes.User;


public class EmailManager implements EmailService {

	@Override
	public void sendVerificationEmail(User user) {
		System.out.println(user.getEmail() +" adresine do�rulama maili g�nderildi l�tfen linke t�klayarak do�rulay�n�z.");
		
	}

	@Override
	public void verifyEmail(User user) {
		System.out.println(user.getEmail()+" do�ruland�,�yelik tamamland�.");
		
	}

	

}
