package thirdhomework;

public class Student extends User{
	
	String course;
	String comment;
	String successPercentage;
	
	public Student(int id, String firstName, String lastName, String email, String password, String course,
			String comment, String successPercentage) {
		super(id, firstName, lastName, email, password);
		this.comment = comment;
		this.successPercentage = successPercentage;
		this.course=course;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getSuccessPercentage() {
		return successPercentage;
	}

	public void setSuccessPercentage(String successPercentage) {
		this.successPercentage = successPercentage;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}


}
