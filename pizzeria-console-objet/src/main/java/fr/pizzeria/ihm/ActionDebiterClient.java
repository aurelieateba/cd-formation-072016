package fr.pizzeria.ihm;

import fr.pizzeria.exception.DebitException;
import fr.pizzeria.model.Client;
@pizzaAnnotation
public class ActionDebiterClient extends Action {

	public ActionDebiterClient(IhmHelper helper) {
		// TODO Auto-generated constructor stub
		super("Debiter un compte", helper);

	}

	@Override
	public void execute() {
		super.execute();
		System.out.println("afficher la liste de clients" );
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
			client.debiterCompte(montant);
		}catch (DebitException c){
			System.out.println(c.getMessage());
		}
	}	
}
