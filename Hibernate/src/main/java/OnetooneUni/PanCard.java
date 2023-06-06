package OnetooneUni;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class PanCard {
	@Id
	private int pannum;
	private String name;
	private long phone;
	
	@OneToOne
	private AdharCard adharCard;

	public int getPannum() {
		return pannum;
	}

	public void setPannum(int pannum) {
		this.pannum = pannum;
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

	public AdharCard getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(AdharCard adharCard) {
		this.adharCard = adharCard;
	}
	

}
