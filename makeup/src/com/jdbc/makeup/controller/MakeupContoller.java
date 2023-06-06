package com.jdbc.makeup.controller;

import java.util.List;

import com.jdbc.makeup.dto.MakeupDto;

public interface MakeupContoller 
{
	public boolean save(MakeupDto dto);
	public List<MakeupDto> readAll();

}
