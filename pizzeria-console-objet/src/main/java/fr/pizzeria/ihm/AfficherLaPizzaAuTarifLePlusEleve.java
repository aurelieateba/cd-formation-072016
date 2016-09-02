package fr.pizzeria.ihm;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import fr.pizzeria.model.Pizza;
@pizzaAnnotation
public class AfficherLaPizzaAuTarifLePlusEleve extends Action{

	public AfficherLaPizzaAuTarifLePlusEleve(IhmHelper helper) {
		super("Afficher la pizza au tarif le plus élevé", helper);
		// TODO Auto-generated constructor stub
		
		}

		public void execute() {
			System.out.println("**** Afficher la pizza au tarif le plus élevé****");
			Collection<Pizza> pizzas = ((IhmHelper) this.helper).getStockage().findAll();
			for (Pizza pizzaEnCours : pizzas) {
				System.out.println(pizzaEnCours.getCode() + " " + pizzaEnCours.getNom() + " " + pizzaEnCours.getPrix());
			}
			System.out.println("\n");
			List<Pizza> liste1 = pizzas.stream().collect(Collectors.toList()); 
			
			Map<Boolean, List<Pizza>> map = pizzas.stream().collect(Collectors.partitioningBy(p -> p.getPrix() > 0));
			
		}
}


