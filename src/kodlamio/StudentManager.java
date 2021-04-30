package kodlamio;

public class StudentManager extends UserManager {
	
	public void add(Student student) {
		System.out.println(student.getFirstName()+" isimli ögrenci olusturuldu.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName()+" isimli ögrenci silinidi.");
	}
	
	public void update(Student student) {
		System.out.println(student.getFirstName()+" isimli ögrenci güncellendi.");
	}
	public void listStudent(Student[] students) {
		for (Student student : students) {
			System.out.println(student.getFirstName()+" "+student.getLastName());
		}
	}
}
