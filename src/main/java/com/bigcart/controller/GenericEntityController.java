package com.bigcart.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
public class GenericEntityController {
	
		final static String PACKAGE_NAME = "com.bigcart.model.";
		@Autowired 
		GenericService genericService;
		
		@RequestMapping(value="/{id}",method = RequestMethod.GET)
		public BaseEntity get(@PathVariable("entity") String entity, @PathVariable("id") Long id) throws ClassNotFoundException{
			return  genericService.find(Class.forName(PACKAGE_NAME + entity), id);
		}
		
		@RequestMapping(value="/all",method = RequestMethod.GET)
		public List<BaseEntity> getAll(@PathVariable("entity") String entity) throws ClassNotFoundException{
			return genericService.getAll(Class.forName(PACKAGE_NAME + entity));
		}		
		
		@RequestMapping(value="/save",method = RequestMethod.POST)
		public void save(@PathVariable("entity") String entity, @RequestBody GenericDto dto) throws JsonParseException, 
		JsonMappingException, IOException, ClassNotFoundException {
			ObjectMapper mapper = new ObjectMapper();
			BaseEntity obj = (BaseEntity) mapper.readValue(dto.getJson().replaceAll("'", "\""), Class.forName(PACKAGE_NAME + entity));
			genericService.save(obj);
		}
		
}
