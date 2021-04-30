package kodlamio;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {
		
		System.out.println(instructor.getFirstName()+" isimli eðitmen olusturuldu.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" isimli eðitmen silinidi.");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" isimli eðitmen güncellendi.");
		
	}
	public void listInstructor(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println(instructor.getFirstName()+" "+instructor.getLastName());
		}
	}
}
