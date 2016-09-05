package fr.pizzeria.service;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import fr.pizzeria.exception.CreditException;
import fr.pizzeria.model.Client;
import fr.pizzeria.model.Pizza;

public class StockageClientMap implements Stockage <Client> {

	
	public Map<Integer, Client> clients = new TreeMap<>();

	public StockageClientMap() {
		this.clients.put(001, new Client(001, "ATEBA", 50000));
		this.clients.put(002, new Client(002, "FRANCOIS", 4000));
		this.clients.put(003, new Client(003, "RAFAEL", 100));
		this.clients.put(004, new Client(004, "CHARLEEN", 10000));
		this.clients.put(005, new Client(005, "MOHAMMED", 3000));
		this.clients.put(006, new Client(006, "JUDICAEL", 1000));
		this.clients.put(007, new Client(007, "CHARLES-ANTOINE", 500));
		}
	
	@Override
	public Collection<Client> findAll() {
		// TODO Auto-generated method stub
		return clients.values();
	}

	@Override
	public void save(Client newElement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Client editElement, String code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String ancienCode) {
		// TODO Auto-generated method stub
		
	}
	
	public Client find(Integer id){
		return clients.get(id);
		}

}
