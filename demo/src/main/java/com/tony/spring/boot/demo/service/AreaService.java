package com.tony.spring.boot.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tony.spring.boot.demo.pojo.Area;

public interface AreaService {
	
	Area getAreaById (int id) throws Exception;
	List<Area> getAllArea () throws Exception;
}
