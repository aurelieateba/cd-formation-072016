package fr.pizzeria.model;

import java.util.Arrays;
import java.util.Enumeration;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Pizza {

	
	private static int NbPizza;
    @Id
    @GeneratedValue	
	private Integer id;
    
	private String code;
	private String nom;
	private Double prix;
	@Enumerated
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
	
	
	
	public Pizza() {
		super();
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
		



