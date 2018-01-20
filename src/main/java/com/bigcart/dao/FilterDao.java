package com.bigcart.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bigcart.domain.CategoryDto;
import com.bigcart.domain.FilterDto;

@Repository
public class FilterDao {

	@Autowired
	private EntityManager entityManager;

	public List<FilterDto> getFilters() {
		
		Query query = entityManager.createNativeQuery("SELECT f.filter_id AS id, fd.name AS NAME, "
						+ "fgd.name AS GROUP_NAME, f.sort_order "
						+ "FROM oc_filter f "
						+ "JOIN oc_filter_description fd ON f.filter_id = fd.filter_id "
						+ "LEFT OUTER JOIN oc_filter_group fg ON f.filter_group_id = fg.filter_group_id "
						+ "LEFT OUTER JOIN oc_filter_group_description fgd ON fg.filter_group_id = fgd.filter_group_id ");
		
		List<Object[]> list = query.getResultList();
		 
		List<FilterDto> filters = new ArrayList<FilterDto>();
		
		for (Object[] a : list) {
			filters.add(new FilterDto(new Long(a[0].toString()), toString(a[1]),
					toString(a[2]), new Integer(toString(a[3]))));
		}
		
		return filters;
		
	}
	
	
	private String toString(Object value) {
		return value == null ? null : value.toString();
	}
}
