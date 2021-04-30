package kodlamio;

public class Main {

	public static void main(String[] args) {
		
		Student student1 =new Student();
		student1.setFirstName("BARAN");
		student1.setLastName("KANGAL");
		student1.setEmail("barannnkngl@gmail.com");
		student1.setCourse("JAVA");
		
		Student student2 =new Student();
		student2.setFirstName("CANSU");
		student2.setLastName("AKSU");
		student2.setEmail("crazyboy06@hotmail.com");
		student2.setCourse("c#");
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engndmrg@gmail.com");
		instructor1.setAbility("JAVA - C# - PYTHON");
		
		Instructor instructor2 = new Instructor();
		instructor2.setFirstName("Mustafa Murat");
		instructor2.setLastName("Coşkun");
		instructor2.setEmail("MMC@gmail.com");
		instructor2.setAbility("JAVA - C++ - PYTHON");
		
		
		
		User user1 = new User();
		user1.setEmail("kangalbrn@gmail.com");
		user1.setFirstName("Ferhat");
		user1.setLastName("KANGAL");
		
		
		
		UserManager userManager=new UserManager();
		Student[] students= {student1,student2};
		User[] users= {user1,instructor1,instructor2,student1,student2};
		userManager.listUser(users);
		userManager.add(student1);
		userManager.add(student2);
		userManager.delete(instructor2);
		userManager.update(instructor1);
		userManager.listUser(students);
		
		
	}
}
