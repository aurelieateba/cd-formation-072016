package fr.pizzeria.console;

import java.util.Calendar;
import java.util.ResourceBundle;
import java.util.Scanner;

import org.apache.commons.lang3.time.DateFormatUtils;

import fr.pizzeria.ihm.IhmHelper;
import fr.pizzeria.ihm.Menu;
import fr.pizzeria.model.Client;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.service.Stockage;
import fr.pizzeria.service.StockageClientMap;
import fr.pizzeria.service.StockagePizzaMap;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) throws ClassNotFoundException ,InstantiationException,IllegalAccessException{

		Scanner scanner = new Scanner(System.in);
        ResourceBundle bundle = ResourceBundle.getBundle("application");
        
        String classeStockagePizza = bundle.getString("stockage.pizza");
        
        System.out.println(classeStockagePizza);
        
        Class<? > classePizza = Class.forName(classeStockagePizza);

        Stockage<Pizza> stockage = (Stockage<Pizza>) classePizza.newInstance();
        
        		
		Stockage<Pizza> stockagePizza = new StockagePizzaMap();
		Stockage<Client> stockageClient = new StockageClientMap();

		IhmHelper helper = new IhmHelper(stockagePizza, stockageClient, scanner);
			
		//Afficher la date
		Calendar calendardate = Calendar.getInstance();
		DateFormatUtils.format(calendardate, "dd/MM  '-' HH:mm ");
		System.out.println(DateFormatUtils.format(calendardate, "dd/MM  '-' HH:mm "));

		// Afficher le Menu

		Menu listMenu = new Menu(helper);

		listMenu.start();

		scanner.close();

	}

}
