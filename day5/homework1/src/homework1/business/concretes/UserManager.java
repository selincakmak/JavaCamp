package homework1.business.concretes;

import homework1.business.abstracts.EmailService;
import homework1.business.abstracts.UserService;
import homework1.business.abstracts.ValidationService;
import homework1.core.AuthService;
import homework1.dataAccess.abstracts.UserDao;
import homework1.entities.concretes.User;


public class UserManager implements UserService {

	private UserDao userDao;
	private EmailService emailService;
	private ValidationService validationService;
	private AuthService authService;
	
	

	public UserManager(UserDao userDao, EmailService emailService, ValidationService validationService,AuthService authService) {
		super();
		this.userDao = userDao;
		this.emailService = emailService;
		this.validationService = validationService;
		this.authService=authService;
	}

	@Override
	public void register(User user) {
		if(validationService.emailIsValid(user, userDao.getAllEmails())==true &&
				validationService.passwordIsValid(user)==true &&
				validationService.firstNameIsValid(user)==true &&
				validationService.lastNameIsValid(user)==true) {
			this.userDao.register(user);
			this.authService.registerToSystem();
			this.emailService.sendVerificationEmail(user);
			this.emailService.verifyEmail(user);
			
		}
		else {
			System.out.println("Kayýt olunamadý.");
		}
		
			
		
	}

	@Override
	public void login(User user,String email,String password) {
		
		if(email==user.getEmail() && password==user.getPassword()){
			this.userDao.login(user);
		}
		
		else {
			System.out.println("Lütfen giriþ yapmak için geçerli email ve parola girin.");
		}
	}
}
	
	


	


