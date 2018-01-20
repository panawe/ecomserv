package com.bigcart.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bigcart.domain.GenericDto;
import com.bigcart.model.BaseEntity;
import com.bigcart.service.GenericService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@RequestMapping(value="/service/{entity}")
@CrossOrigin
public class GenericEntityController {
	
		final static String PACKAGE_NAME = "com.bigcart.model.";
		@Autowired 
		GenericService genericService;
		
		@RequestMapping(value="/{id}",method = RequestMethod.GET)
		public BaseEntity get(@PathVariable("entity") String entity, @PathVariable("id") Long id) throws ClassNotFoundException{
			BaseEntity result = genericService.find(Class.forName(PACKAGE_NAME + entity), id);
			return result;
		}
		
		@RequestMapping(value="/all",method = RequestMethod.GET)
		public List<BaseEntity> getAll(@PathVariable("entity") String entity) throws ClassNotFoundException{
			 List<BaseEntity> entities = genericService.getAll(Class.forName(PACKAGE_NAME + entity));
			 System.out.println(entities);
			 return entities;
		}		
		
		@RequestMapping(value="/save",method = RequestMethod.POST)
		public BaseEntity save(@PathVariable("entity") String entity, @RequestBody GenericDto dto) throws JsonParseException, 
		JsonMappingException, IOException, ClassNotFoundException {
			ObjectMapper mapper = new ObjectMapper();
			BaseEntity obj = (BaseEntity) mapper.readValue(dto.getJson().replaceAll("'", "\""), Class.forName(PACKAGE_NAME + entity));
			genericService.save(obj);
			return obj;
		}
		
		@RequestMapping(value="/delete",method = RequestMethod.POST)
		public String delete(@PathVariable("entity") String entity, @RequestBody List<Long> ids) throws JsonParseException, 
		JsonMappingException, IOException, ClassNotFoundException {
			this.genericService.delete(Class.forName(PACKAGE_NAME + entity), ids);
			return "SUCCESS";
		}
		
}
