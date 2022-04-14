package pr.multiAttriAsGroupKey.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class EventRegister {
	private String catalog;
	private String eventName;
	private String company;
	
	private String userId;
	
	@JsonIgnore
	private final EventRegisterGroupKey groupKey;	
	
	public EventRegister(String catalog, String eventName, String company, String userId) {
		super();
		this.catalog = catalog;
		this.eventName = eventName;
		this.company = company;
		this.userId = userId;
		
		this.groupKey = new EventRegisterGroupKey(this.catalog, this.eventName, this.company);
	}

	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public EventRegisterGroupKey getGroupKey() {
		return groupKey;
	}
	
}
