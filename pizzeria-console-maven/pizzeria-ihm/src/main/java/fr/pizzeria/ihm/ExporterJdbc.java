package fr.pizzeria.ihm;

import java.util.Collection;
import java.util.List;

import fr.pizzeria.model.Pizza;
import fr.pizzeria.service.Export;
import fr.pizzeria.service.StockageClientMap;
import fr.pizzeria.service.StockagePizzaMap;

public class ExporterJdbc extends Action{

	public ExporterJdbc(IhmHelper helper) {
		super("Exporter Pizza", helper);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		Export export = new Export();
		StockagePizzaMap listep = new StockagePizzaMap();
		Collection<Pizza> liste =  listep.findAll();
		for (Pizza pizza : liste) {
			export.save(pizza);
		}
		
	}

}
