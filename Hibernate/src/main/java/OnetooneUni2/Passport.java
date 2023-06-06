package OnetooneUni2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Passport {
	@Id
	private int pid;
	private String pnmae;
	private long phone;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPnmae() {
		return pnmae;
	}
	public void setPnmae(String pnmae) {
		this.pnmae = pnmae;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public void setPerson(Person person) {
		// TODO Auto-generated method stub
		
	}

}
