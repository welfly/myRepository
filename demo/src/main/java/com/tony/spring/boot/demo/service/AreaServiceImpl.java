package com.tony.spring.boot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tony.spring.boot.demo.dao.AreaMapper;
import com.tony.spring.boot.demo.pojo.Area;

@Service("areaService")
public class AreaServiceImpl implements AreaService {

	@Autowired
	@Qualifier("areaMapper")
	private AreaMapper areaMapper;
	
	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public Area getAreaById(int id) throws Exception {
		Area area =  areaMapper.findById(id);
		return area;
	}

	@Override
	public List<Area> getAllArea() throws Exception {
		List<Area> allAreaList = areaMapper.findAll();
		return allAreaList;
	}

}
