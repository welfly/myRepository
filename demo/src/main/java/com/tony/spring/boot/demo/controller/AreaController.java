package com.tony.spring.boot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tony.spring.boot.demo.pojo.Area;
import com.tony.spring.boot.demo.service.AreaService;

@RestController
public class AreaController {
	@Autowired
	@Qualifier("areaService")
	private AreaService areaService;
	
	@RequestMapping(value="/getAreaById/{id}", method=RequestMethod.GET)
	public Area method1(@PathVariable(value="id") int id) {
		try {
			Area area = areaService.getAreaById(id);
			return area;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String sayHi() {
		return "index";
	}
	
	@RequestMapping(value="/getAllAreas", method=RequestMethod.GET)
	public List<Area> method2() {
		try {
			List<Area> listArea = areaService.getAllArea();
			System.out.println(888);
			return listArea;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
