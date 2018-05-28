package lagersystemPackage;

import java.util.Date;

public class LagerItem {

	private int id;
	private String type;
	private String name;
	private Date dateOfExpiry;
	private Date dateOfBuying;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public Date getDateOfBuying() {
		return dateOfBuying;
	}
	public void setDateOfBuying(Date dateOfBuying) {
		this.dateOfBuying = dateOfBuying;
	}
}
