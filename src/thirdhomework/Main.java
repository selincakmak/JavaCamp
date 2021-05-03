package thirdhomework;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user1 = new User(1,"Selin","�akmak", "hselincakmak@gmail.com", "1234");
		UserManager userManager = new UserManager();
		userManager.logIn(user1);
		System.out.println("-----------------------------------------");
		
		Student student1 =new Student(1, "Selin","�akmak", "hselincakmak@gmail.com", "1234","Java & React","verimli bir kurs", "50");
	    StudentManager studentManager=new StudentManager();	
		studentManager.register(student1);
		System.out.println("-----------------------------------------");
		
		
		Instructor instructor1=new Instructor(1, "Selin", "�akmak","hsc@gmail.com","1234",
				new String[] {"Java","C#"},
				new String[] {"Eyl�l","Zeynep"},
				new String[] {"�dev3","�dev2"});
		
		InstructorManager instructorManager1=new InstructorManager();
		
		instructorManager1.addHomework(instructor1);
		instructorManager1.getAllCourses(instructor1);
		instructorManager1.getAllStudents(instructor1);
		
		System.out.println("-----------------------------------------");
		userManager.logOut(user1);

	
		

	}

}
