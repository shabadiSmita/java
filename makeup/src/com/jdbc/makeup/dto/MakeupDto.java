package com.jdbc.makeup.dto;

public class MakeupDto 
{
  private int id;
  private String brandname;
  private String colour;
  private int price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrandname() {
	return brandname;
}
public void setBrandname(String brandname) {
	this.brandname = brandname;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public MakeupDto(int id, String brandname, String colour, int price) {
	super();
	this.id = id;
	this.brandname = brandname;
	this.colour = colour;
	this.price = price;
}
@Override
public String toString() {
	return "MakeupDto [id=" + id + ", brandname=" + brandname + ", colour=" + colour + ", price=" + price + "]";
}
  
}
