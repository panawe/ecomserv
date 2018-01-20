package com.bigcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bigcart.dao.CategoryDao;
import com.bigcart.domain.CategoryDto;
import com.bigcart.model.BaseEntity;

@RestController
@RequestMapping(value="/service/category")
@CrossOrigin
public class CategoryController {

	@Autowired 
	CategoryDao categoryDao;
	
	@RequestMapping(value="/alls",method = RequestMethod.GET)
	public List<CategoryDto> getAll() throws ClassNotFoundException{
		 List<CategoryDto> entities = categoryDao.getCategories();
		 System.out.println(entities);
		 return entities;
	}		
	
}
