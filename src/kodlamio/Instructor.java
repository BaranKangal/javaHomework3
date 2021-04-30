package kodlamio;

public class Instructor extends User{
	private Long id;
	private String ability;
	
	
	public Instructor(Long id, String ability) {
		super();
		this.id = id;
		this.ability = ability;
	}
	
	
	public Instructor() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getAbility() {
		return ability;
	}


	public void setAbility(String ability) {
		this.ability = ability;
	}
}
