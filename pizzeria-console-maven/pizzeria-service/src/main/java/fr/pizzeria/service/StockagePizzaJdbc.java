package fr.pizzeria.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Client;
import fr.pizzeria.model.Pizza;


public class StockagePizzaJdbc  implements Stockage<Pizza>{
	public StockagePizzaJdbc(){
		super();
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e){
			 throw new RuntimeException(e);
		}
		
	}
	public Collection<Pizza> findAll(){
		 Collection<Pizza> listPizzas = new ArrayList<>();
	        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzeria?useSSL=false",
	                "root", "");
	                Statement st = connection.createStatement();
	                ResultSet resultat = st.executeQuery("SELECT * FROM PIZZA ORDER BY libelle");) {

	            while (resultat.next()) {
	                Pizza p = new Pizza();
	                p.setCode(resultat.getString("reference"));
	                p.setNom(resultat.getString("libelle"));
	                p.setPrix(resultat.getBigDecimal("prix").doubleValue());
	                //p.setCatpizza(CategoriePizza.valueOf(resultat.getString("categorie")));
	                listPizzas.add(p);
	            }

	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	        return listPizzas;
	}
       public void saveTobject (Pizza newTobject){
    	   //Auto-generated method stub
       }
	public void save(Pizza newElement) {
		// TODO Auto-generated method stub
		
	}
	public void update(Pizza editElement, String code) {
		// TODO Auto-generated method stub
		
	}
	public void delete(String ancienCode) {
		// TODO Auto-generated method stub
		
	}
	public Client find(Integer clientChoisi) {
		// TODO Auto-generated method stub
		return null;
	}
}
