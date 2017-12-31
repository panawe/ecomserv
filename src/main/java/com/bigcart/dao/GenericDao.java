package com.bigcart.dao;

import java.util.List;

public interface GenericDao<E,K> {
	public void save(E entity);
	public void delete(E entity);
	public E find(Class cl, Long key);
	public List<E> getAll(Class cl);
}
