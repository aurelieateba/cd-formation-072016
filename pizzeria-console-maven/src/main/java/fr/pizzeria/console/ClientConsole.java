package fr.pizzeria.console;

import fr.pizzeria.exception.DebitException;
import fr.pizzeria.model.Client;

public class ClientConsole {

	public static void main(String[] args) throws DebitException {
		// TODO Auto-generated method stub
          Client client =new Client ();
          client.setSolde(10);
          
          
          
          
          //créee un objet à partir de la classe Client
          
          Client client1 = new Client();
          Client client2 = new Client("Hugues");
          Client client3 = new Client(3,"Thomas",120);
          client3.debiterCompte(100);
          
          try{
        	    client3.debiterCompte(120000);
          } catch (DebitException e){
        	  //e.printStackTrace();
          }
          
      
          // affiche le nom du client 1
          
          System.out.println(" le nom du client1 = " + client1.getNom());
          
          // affiche le nom du client 2
          
          System.out.println(" le nom du client2 = " + client2.getNom());
          
          // affiche le nom du client 3
          
          System.out.println(" le nom du client3 = " + client3.getNom());
          
          //invoquer méthode débiter compte pour le client  
          
          client3.debiterCompte(5);
          
          System.out.println("le solde du client3 = " + 5);
          
      
          //affiche l'id du client 3
          System.out.println("l'id du client3= " + 3);
          
    
      
	}

}
