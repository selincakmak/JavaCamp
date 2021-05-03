package thirdhomework;

public class StudentManager extends UserManager{
	
	public void register(Student student)
	{
		System.out.println(student.getFirstName()+"  "+ student.getCourse()+" kursuna başarıyla kaydoldunuz.");
	}

}
