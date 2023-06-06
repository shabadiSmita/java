package OnetooneUni1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Person1 {
	@Id
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	
	@OneToOne
	private BankAccount account;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
