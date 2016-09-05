package fr.pizzeria.ihm;

import java.util.Collection;

import fr.pizzeria.model.Client;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.service.Stockage;

public class StockagePizzaFichier implements Stockage <Pizza>{

	@Override
	public Collection<Pizza> findAll() {
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
