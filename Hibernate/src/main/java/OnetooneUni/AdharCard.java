package OnetooneUni;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AdharCard {
	@Id
	private int adharnum;
	private String name;
	private long phone;
	public int getAdharnum() {
		return adharnum;
	}
	public void setAdharnum(int adharnum) {
		this.adharnum = adharnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	

}
