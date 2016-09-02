package fr.pizzeria.ihm;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.xml.ws.WebServiceProvider;

import fr.pizzeria.exception.CreditException;
import fr.pizzeria.model.Client;
@pizzaAnnotation
public class ActionCrediterClient extends Action{

	public ActionCrediterClient(IhmHelper helper) {
		// TODO Auto-generated constructor stub
	super("Crediter un Compte Client", helper);
	
	
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
	
		super.execute();
		System.out.println("afficher la liste des clients" );
		// On cree l'actionLister Client
		ActionListerClients actionListerClient = new ActionListerClients(helper);
		actionListerClient.execute();
		// on lui demande quel client
		System.out.println("client choisi ????");
		// id du client choisi
		Integer clientChoisi = helper.getScanner().nextInt();
		// on selectione l'element
		Client client = helper.getStockageClient().find(clientChoisi);
		// on affiche le solde
		System.out.println(client.getSolde());
		// on demande le montant du credit 
		Double montant = helper.getScanner().nextDouble();
		try {
			client.crediterCompte(montant);
		}catch (CreditException c){
			System.out.println(c.getMessage());
			//c.printStackTrace();
		}
	}
	

}
