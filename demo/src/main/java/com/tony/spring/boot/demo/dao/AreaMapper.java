package com.tony.spring.boot.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tony.spring.boot.demo.pojo.Area;

@Mapper
public interface AreaMapper {
	Area findById(int id);
	List<Area> findAll();
}
