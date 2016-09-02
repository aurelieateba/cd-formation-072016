package fr.pizzeria.ihm;

import java.util.Scanner;


import fr.pizzeria.exception.SaisieEntierException;
import fr.pizzeria.model.Client;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.service.Stockage;

public class IhmHelper {

	private Stockage<Pizza> stockagePizza;
	private Stockage<Client> stockageClient;
	private Scanner scanner;

	public IhmHelper(Stockage<Pizza> stockage,Stockage<Client> stockageC, Scanner scanner) {
		super();
		this.stockagePizza = stockage;
		this.scanner = scanner;
		this.stockageClient= stockageC;
	}

	public int saisirEntier() throws SaisieEntierException {
		try {
			String saisie = scanner.next();
			return Integer.parseInt(saisie);
		} catch (NumberFormatException e) {
			throw new SaisieEntierException(e);
		}
	}

	public Stockage <Pizza> getStockage() {
		return stockagePizza;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public Stockage<Client> getStockageClient() {
		return stockageClient;
	}

	public void setStockageClient(Stockage<Client> stockageClient) {
		this.stockageClient = stockageClient;
	}

}
