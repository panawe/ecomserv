package com.bigcart.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigcart.dao.GenericDao;
import com.bigcart.model.BaseEntity;

@Service
public class GenericServiceImpl implements GenericService {
	
	@Autowired
	GenericDao<BaseEntity, String> genericDao;
	
	@Transactional
	public void save(BaseEntity entity) {	
		entity.setCreateDate(new Date());
		entity.setModDate(new Date());
		entity.setModifiedBy(1L);
		this.genericDao.save(entity);		
	}
	
	public void delete(BaseEntity entity) {
		this.genericDao.delete(entity);
	}

	public BaseEntity find(Class cl, Long key) {
		return (BaseEntity) this.genericDao.find(cl, key);
	}

	public List<BaseEntity> getAll(Class cl) {
		return this.genericDao.getAll(cl);
	}

}
