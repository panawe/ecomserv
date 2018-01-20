package com.bigcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bigcart.dao.FilterDao;
import com.bigcart.domain.FilterDto;

@RestController
@RequestMapping(value="/service/filter")
@CrossOrigin
public class FilterController {

	@Autowired 
	FilterDao filterDao;
	
	@RequestMapping(value="/alls",method = RequestMethod.GET)
	public List<FilterDto> getAll() throws ClassNotFoundException{
		 List<FilterDto> entities = filterDao.getFilters();
		 System.out.println(entities);
		 return entities;
	}		
	
}
