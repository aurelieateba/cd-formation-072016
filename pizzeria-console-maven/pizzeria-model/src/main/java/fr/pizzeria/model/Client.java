package fr.pizzeria.model;

import fr.pizzeria.exception.CreditException;
import fr.pizzeria.exception.DebitException;

public class Client {

	public static final int Seuil = 5000;
	private Integer id;
	private String nom;
	private String prenom;
	private double solde;
	public String debiterCompte;
	
	public Client (){
	}
	
	public Client (String nouveauNom){
		this.nom=nouveauNom;
	}
	public Client (Integer nouvelId, String nouveauNom, double nouveauSolde){
		this.nom=nouveauNom;
		this.id=nouvelId;
		this.solde=nouveauSolde;
	}
	
	public void debiterCompte(double montant) throws DebitException {
		Double nouveauSolde = this.solde - montant;
		
		 if (nouveauSolde<0) {
			 throw new DebitException();
		 }
		 else{
			 this.solde=nouveauSolde; 	 
		 }
		}
	
	public void crediterCompte(double i) throws CreditException {
		Double nouveauSolde = this.solde + i;
		
		 if (nouveauSolde> 5000) {
			 throw new CreditException();
		 }
		 else{
		 this.solde=nouveauSolde;
		 }	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = getId() + " " + getNom() + " " +getSolde();
		return str;
		
		
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}

	
}
