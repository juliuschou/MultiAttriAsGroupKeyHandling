package pr.multiAttriAsGroupKey.service;

public class Member{
	
	private String id;
	private String name;
	private String gender;
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Member(String id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	
}
