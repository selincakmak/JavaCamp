package homework1.business.abstracts;

import homework1.entities.concretes.User;

public interface EmailService {
	void sendVerificationEmail(User user);
	void verifyEmail(User user);


}
