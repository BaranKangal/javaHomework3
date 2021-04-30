package kodlamio;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {
		
		System.out.println(instructor.getFirstName()+" isimli e�itmen olusturuldu.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" isimli e�itmen silinidi.");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" isimli e�itmen g�ncellendi.");
		
	}
	public void listInstructor(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println(instructor.getFirstName()+" "+instructor.getLastName());
		}
	}
}
