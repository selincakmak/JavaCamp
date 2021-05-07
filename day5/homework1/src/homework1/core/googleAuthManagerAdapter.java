package homework1.core;



import homework1.googleAuth.googleAuthManager;

public class googleAuthManagerAdapter implements AuthService {

	

	@Override
	public void registerToSystem() {
		googleAuthManager manager=new googleAuthManager();
		manager.register();
		
	}

}
