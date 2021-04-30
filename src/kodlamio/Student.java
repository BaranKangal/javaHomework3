package kodlamio;

public class Student extends User {
	private Long id;
	private String course;
	
	
	
	public Student() {
		
	}
	
	public Student(Long id, String course) {
		super();
		this.id = id;
		this.course = course;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	
	
	
}
