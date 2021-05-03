package thirdhomework;

public class Instructor extends User {
	String[] courses;
	String[] students;
	String[] homeworks;
	
	
	public Instructor(int id, String firstName, String lastName, String email, String password,
			String[] courses,String[] students, String[] homeworks) {
		super(id, firstName, lastName, email, password);
		this.courses=courses;
		this.students = students;
		this.homeworks = homeworks;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
	public String[] getStudents() {
		return students;
	}
	public void setStudents(String[] students) {
		this.students = students;
	}
	public String[] getHomeworks() {
		return homeworks;
	}
	public void setHomeworks(String[] homeworks) {
		this.homeworks = homeworks;
	}

	
	

}
