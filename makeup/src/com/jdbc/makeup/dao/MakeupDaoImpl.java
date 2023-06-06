package com.jdbc.makeup.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.makeup.DbUtils.Util;
import com.jdbc.makeup.dto.MakeupDto;

public class MakeupDaoImpl implements MakeupDao {
	List<MakeupDto> database = new ArrayList<MakeupDto>();

	@Override
	public boolean save(MakeupDto dto) {
		String query = "insert into makeupproducts values(?,?,?,?)";
		
		try (Connection connection = Util.getConnection();
				PreparedStatement pst = connection.prepareStatement(query);){
			

			pst.setInt(1, dto.getId());
			pst.setString(2, dto.getBrandname());
			pst.setString(3, dto.getColour());
			pst.setInt(4, dto.getPrice());
			pst.executeUpdate();
			pst.close();
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<MakeupDto> readAll() {
String query = "select * from makeupproducts";
		
		try (Connection connection = Util.getConnection();
				PreparedStatement pst = connection.prepareStatement(query);){
			
ResultSet result = pst.executeQuery();
List<MakeupDto> database = new ArrayList<MakeupDto>();
while(result.next()){
	 int id=result.getInt(1);
	 String name = result.getNString(2);
	 String colour = result.getString(3);
	 int price = result.getInt(4);
	 
	 MakeupDto dto = new MakeupDto(id, name, colour, price);
	 database.add(dto);
}
	 return database;
	
		

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

}
