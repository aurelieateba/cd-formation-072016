package fr.pizzeria.model;

import java.util.Arrays;

public class Pizza {

	private static int NbPizza;

	private String code;
	private String nom;
	private double prix;
	private CategoriePizza catpizza;
	
	

	public CategoriePizza getCatpizza() {
		return catpizza;
	}

	public void setCatpizza(CategoriePizza catpizza) {
		this.catpizza = catpizza;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	

	public Pizza(String code, String nom, double prix, CategoriePizza catpizza) {
		super();
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		this.catpizza = catpizza;

	}

	public Pizza(String code, String nom, double prix) {
		super();
		this.code = code;
		this.nom = nom;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Pizza [code=" + code + ", nom=" + nom + ", prix=" + prix + ", catpizza=" + catpizza + "]";
	}
		
		
		    }
		



