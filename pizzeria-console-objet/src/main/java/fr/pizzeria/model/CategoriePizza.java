package fr.pizzeria.model;

public enum CategoriePizza {

	 Viande("Viande"),
	 Poisson("Poisson"),
	 Sans_Viande("Sans viande");
	
	 
	  private String name ;
	   
	  //Constructeur
	  CategoriePizza (String name){
	    this.name = name;
	  }
	   
	  public String toString(){
	    return name;
	    
	    
	  }
	 
	 
	}

