package kodlamio;

public class StudentManager extends UserManager {
	
	public void add(Student student) {
		System.out.println(student.getFirstName()+" isimli �grenci olusturuldu.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName()+" isimli �grenci silinidi.");
	}
	
	public void update(Student student) {
		System.out.println(student.getFirstName()+" isimli �grenci g�ncellendi.");
	}
	public void listStudent(Student[] students) {
		for (Student student : students) {
			System.out.println(student.getFirstName()+" "+student.getLastName());
		}
	}
}
