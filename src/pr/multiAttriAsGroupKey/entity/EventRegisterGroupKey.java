package pr.multiAttriAsGroupKey.entity;

import pr.multiAttriAsGroupKey.vo.EventRegisterVo;

public class EventRegisterGroupKey {
	private String catalog;
	private String eventName;
	private String company;
	
	public EventRegisterGroupKey(String catalog, String eventName, String company) {
		super();
		this.catalog = catalog;
		this.eventName = eventName;
		this.company = company;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((catalog == null) ? 0 : catalog.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventRegisterGroupKey other = (EventRegisterGroupKey) obj;
		if (catalog == null) {
			if (other.catalog != null)
				return false;
		} else if (!catalog.equals(other.catalog))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (eventName == null) {
			if (other.eventName != null)
				return false;
		} else if (!eventName.equals(other.eventName))
			return false;
		return true;
	}
	
	public EventRegisterVo makeEventRegisterVo() {
		return new EventRegisterVo(this.catalog, this.eventName, this.company);
	} 
	
}
