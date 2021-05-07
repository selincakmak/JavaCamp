package homework1.business.abstracts;



import homework1.entities.concretes.User;

public interface UserService {
	
  void register(User user);
  void login(User user,String email,String password);
  

}
