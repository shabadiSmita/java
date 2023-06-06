package onetoonemapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import onetoonemapping.dao.HotelDao;
import onetoonemapping.dto.Hotel;
import onetoonemapping.dto.Item;

public class HotelController {
	public static void main(String[] args) {
		
	
	ApplicationContext apc = new ClassPathXmlApplicationContext("META-INF/hotel.xml");
	Hotel h = (Hotel) apc.getBean("ht");
	h.setId(1);
	h.setName("Udapi");
	h.setAddress("BTM");
   System.out.println(h);
	
	
	
	}
	
}

