package model;

public class User {
	private long id;
	private String name;
	private String gender;
	private String image;
		
	public User(long id, String name, String gender, String image) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.image = image;
	}
	
	public User() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
