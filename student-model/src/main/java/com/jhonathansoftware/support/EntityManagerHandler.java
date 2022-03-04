package com.jhonathansoftware.support;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

// singleton pattern
public enum EntityManagerHandler {

	INSTANCE;
	
	private EntityManagerFactory factory = Persistence.
			createEntityManagerFactory("com.globalsoftwaresupport.jpa");
	private EntityManager entityManager = factory.createEntityManager();
	private EntityTransaction transaction = entityManager.getTransaction();
	
	public void open() {
		if(!transaction.isActive())
			transaction.begin();
	}
	
	public EntityManagerFactory getFactory() {
		return factory;
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public EntityTransaction getTransaction() {
		return transaction;
	}
	
	public void shutdown() {
		entityManager.close();
		factory.close();
	}
}
