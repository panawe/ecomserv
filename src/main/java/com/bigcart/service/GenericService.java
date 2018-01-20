package com.bigcart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bigcart.model.BaseEntity;

@Service
public interface GenericService {
	
	public void save(BaseEntity entity);
	public void delete(BaseEntity entity);
	public void delete(Class cl, List<Long> ids);
	public BaseEntity find(Class cl, Long key);
	public List<BaseEntity> getAll(Class cl);
}
