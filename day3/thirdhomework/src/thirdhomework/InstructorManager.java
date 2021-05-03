package thirdhomework;

public class InstructorManager extends UserManager {
	public void addHomework(Instructor instructor)
	{
		for (int i=0;i<instructor.getHomeworks().length;i++) {
			System.out.println("Ögrenci " + (i+1) + " = " + instructor.getHomeworks()[i]);
		}
		
	}

	public void getAllCourses(Instructor instructor) {
		for (int i=0;i<instructor.getCourses().length;i++) {
			System.out.println("Kurs " + (i+1) + " = " + instructor.getCourses()[i]);
		}
	}
	public void getAllStudents(Instructor instructor) {
		for (int i=0;i<instructor.getStudents().length;i++) {
			System.out.println("Ögrenci " + (i+1) + " = " + instructor.getStudents()[i]);
		}
	}
	
}
