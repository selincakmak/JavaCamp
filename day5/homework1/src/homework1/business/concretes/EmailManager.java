package homework1.business.concretes;

import homework1.business.abstracts.EmailService;
import homework1.entities.concretes.User;


public class EmailManager implements EmailService {

	@Override
	public void sendVerificationEmail(User user) {
		System.out.println(user.getEmail() +" adresine doðrulama maili gönderildi lütfen linke týklayarak doðrulayýnýz.");
		
	}

	@Override
	public void verifyEmail(User user) {
		System.out.println(user.getEmail()+" doðrulandý,üyelik tamamlandý.");
		
	}

	

}
