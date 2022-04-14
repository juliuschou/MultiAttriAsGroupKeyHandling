package pr.multiAttriAsGroupKey.service;

public class ClubMember{
	
	private String id;
	private String name;
	private String gender;
	private String country;
	
	private ClubMemberGroupKey clubMemberGroupKey = null;
	

	public ClubMember(String id, String name, String gender, String country) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.country = country;
		this.clubMemberGroupKey = new ClubMemberGroupKey(gender, country);
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ClubMemberGroupKey getClubMemberGroupKey() {
		return clubMemberGroupKey;
	}

	public void setClubMemberGroupKey(ClubMemberGroupKey clubMemberGroupKey) {
		this.clubMemberGroupKey = clubMemberGroupKey;
	}
	
	public String getGenderCountry() {
		return this.gender+"/" + this.country;
	}
	@Override
	public String toString() {
		return "ClubMember [id=" + id + ", name=" + name + ", gender=" + gender + ", country=" + country + "]";
	}

	
	
}
