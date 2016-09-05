package fr.pizzeria.ihm;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;
@pizzaAnnotation
public class ListePizzaParCategorie extends Action{

	public ListePizzaParCategorie(IhmHelper helper) {
		super("Lister les Pizzas par categorie", helper);
		// TODO Auto-generated constructor stub
		
		}

		public void execute() {
			System.out.println("**** Lister les Pizzas par categorie****");
			Collection<Pizza> pizzas = this.helper.getStockage().findAll();
				
			Map<CategoriePizza, List<Pizza>> map = pizzas.stream().collect(Collectors.groupingBy(p -> p.getCatpizza()));
			map.forEach((group, listePizza) -> {
				System.out.println(group + " ==> " + listePizza);
			});
			
	}
	

}

