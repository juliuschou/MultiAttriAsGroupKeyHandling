package pr.multiAttriAsGroupKey.vo;

import java.util.ArrayList;
import java.util.List;

public class EventRegisterVo {
	private String catalog;
	private String eventName;
	private String company;
	
	public EventRegisterVo(String catalog, String eventName, String company) {
		super();
		this.catalog = catalog;
		this.eventName = eventName;
		this.company = company;
	}

	private final List<User> registers = new ArrayList<>();

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

	public List<User> getRegisters() {
		return registers;
	}
	
	public void addRegUsers(List<User> users) {
		this.registers.addAll(users);
	}
	
}
