package com.jdbc.makeup.dao;

import java.util.List;

import com.jdbc.makeup.dto.MakeupDto;

public interface MakeupDao {

	public boolean save(MakeupDto dto);

	public List<MakeupDto> readAll();
	

}
