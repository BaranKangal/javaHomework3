package kodlamio;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName()+" isimli kullanici olusturuldu.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName()+" isimli kullanici silinidi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+" isimli kullanici güncellendi.");
	}

	public void listUser(User[] users) {
		for (User user : users) {
			System.out.println(user.getFirstName()+" "+user.getLastName());
		}
	}
	
	
}
