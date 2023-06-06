package com.jdbc.makeup;

import java.util.List;

import com.jdbc.makeup.controller.MakeupContoller;
import com.jdbc.makeup.controller.MakeupControllerImpl;
import com.jdbc.makeup.dto.MakeupDto;

public class MakeupRunner 
{
	public static void main(String[] args) 
	{
		MakeupContoller mc=new MakeupControllerImpl();
		
		MakeupDto dto1= new MakeupDto(1,"Loreal","Pink",1000);
		MakeupDto dto2= new MakeupDto(2,"Lakme","Red",1500);
		MakeupDto dto3= new MakeupDto(3,"Ponds","SkyBlue",3000);
		
//		mc.save(dto3);
//		mc.save(dto2);
//		mc.save(dto1);
		
		List<MakeupDto> list = mc.readAll();
	
		for (MakeupDto makeupDto : list) {
			System.out.println(makeupDto);
			
		}
			
	}
	
	

}
