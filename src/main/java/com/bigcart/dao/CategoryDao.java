package com.bigcart.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bigcart.domain.CategoryDto;

@Repository
public class CategoryDao {

	@Autowired
	private EntityManager entityManager;

	public List<CategoryDto> getCategories() {
		
		Query query = entityManager.createNativeQuery("SELECT c.category_id AS id, cd.name AS NAME, "
						+ "pcd1.name AS PARENT1, pcd2.name AS PARENT2, pcd3.name AS PARENT3, c.sort_order "
						+ "FROM oc_category c "
						+ "JOIN oc_category_description cd ON c.category_id = cd.category_id "
						+ "LEFT OUTER JOIN oc_category p1 ON c.parent_id = p1.category_id "
						+ "LEFT OUTER JOIN oc_category_description pcd1 ON p1.category_id = pcd1.category_id "
						+ "LEFT OUTER JOIN oc_category p2 ON p1.parent_id = p2.category_id "
						+ "LEFT OUTER JOIN oc_category_description pcd2 ON p2.category_id = pcd2.category_id "
						+ "LEFT OUTER JOIN oc_category p3 ON p2.parent_id = p3.category_id "
						+ "LEFT OUTER JOIN oc_category_description pcd3 ON p3.category_id = pcd3.category_id "
						+ "ORDER BY pcd3.name, pcd2.name, pcd1.name, cd.name");
		
		List<Object[]> list = query.getResultList();
		 
		List<CategoryDto> categories = new ArrayList<CategoryDto>();
		
		for (Object[] a : list) {
			categories.add(new CategoryDto(new Long(a[0].toString()), toString(a[1]),
					toString(a[2]), toString(a[3]), toString(a[4]), new Integer(toString(a[5]))));
		}
		
		return categories;
		
	}
	
	
	private String toString(Object value) {
		return value == null ? null : value.toString();
	}
}
