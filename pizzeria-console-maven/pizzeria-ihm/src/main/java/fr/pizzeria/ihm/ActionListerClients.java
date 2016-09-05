package fr.pizzeria.ihm;

import java.util.Collection;

import fr.pizzeria.model.Client;
@pizzaAnnotation
public class ActionListerClients extends Action{

	public ActionListerClients(IhmHelper helper) {
		// TODO Auto-generated constructor stub
	super ("Lister les clients", helper);
	
	
	
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		super.execute();
		System.out.println("****Liste des clients*****");
		
		Collection<Client> clients = this.helper.getStockageClient().findAll();
		for (Client clientEnCours : clients) {
			System.out.println(clientEnCours.toString());
		}
		System.out.println("\n");

	}

}
