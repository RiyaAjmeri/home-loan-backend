package com.homeloan.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class GenericDao {
	@PersistenceContext
	protected EntityManager entityManager;
	
	
	public Object save(Object object) {
		return entityManager.merge(object); //merge works for insert and update both
	}
	
	
	
}
