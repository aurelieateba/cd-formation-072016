package fr.pizzeria.service;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.pizzeria.model.Client;
import fr.pizzeria.model.Pizza;

public class StockagePizzaJpa implements Stockage <Pizza>{


	
	private EntityManagerFactory entityManagerFactor =  Persistence.createEntityManagerFactory("");
	
	
	
	@Override
	public Collection<Pizza> findAll() {
		// TODO Auto-generated method stub

		EntityManager em =entityManagerFactor.createEntityManager();
		
		TypedQuery<Pizza> query2 = em.createQuery("select p from Pizza p", Pizza.class); 
		Pizza p2 = query2.getResultList().get(0); 
		
	
		return null;
		
	}

	private static Collection<Pizza> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Pizza newElement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Pizza editElement, String code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String ancienCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client find(Integer clientChoisi) {
		// TODO Auto-generated method stub
		return null;
	}

}
