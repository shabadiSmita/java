package onetoonemapping.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Hotel {
	@Id
	private int id;
	private String name;
	private  String address;
	
	@OneToOne
	 private Item item;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", address=" + address + ", item=" + item + "]";
	}

	public Hotel(int id, String name, String address, Item item) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.item = item;
	}

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
