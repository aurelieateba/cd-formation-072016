package fr.pizzeria.ihm;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.reflections.Reflections;

import fr.pizzeria.exception.SaisieEntierException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class Menu {

	private static final int CHOIX_SORTIR = 99;
	private Map<Integer, Action> actions = new HashMap<>();
	private IhmHelper ihmHelper;
	
	
	public Menu(IhmHelper helper) {
//		this.actions.put(1, new ListerPizzaAction(helper));
//		this.actions.put(2, new AjouterPizzaAction(helper));
//		this.actions.put(3, new ModifierPizzaAction(helper));
//		this.actions.put(4, new SupprimerPizzaAction(helper));
//		this.actions.put(5, new ActionDebiterClient(helper));
//		this.actions.put(6, new ActionCrediterClient(helper));
//		this.actions.put(7, new ActionListerClients(helper));
//		this.actions.put(8, new ListePizzaParCategorie(helper));
//		this.actions.put(9, new AfficherLaPizzaAuTarifLePlusEleve(helper));
		
		Reflections reflections = new Reflections();

		//Set<Class<? extends SomeType>> subTypes = reflections.getSubTypesOf(SomeType.class);
		
		// Une liste de classe annotées
		Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(pizzaAnnotation.class);
		// pour pouvoir incrémenter dans un foreach
		AtomicInteger l = new AtomicInteger(0);
		
		
		// on parcours l'ensemble des classes annotées
		annotated.forEach(action -> {
		// pour chaque action, la mettre dans la liste d'action
			try {
				
				actions.put(l.getAndIncrement(),(Action) action.getConstructor(IhmHelper.class).newInstance(helper));
			
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		 
		
		
		this.ihmHelper = helper;
	}

	public void start() {
		boolean result = false;
		do {
			affichageM();
			result = choisir();
		} while (!result);
	}

	public void affichageM() {
		System.out.println("***** Pizzeria Administration *****");

		for (Integer numero : actions.keySet()) {
			Action ActionEnCours = actions.get(numero);
			String libelleAction = ActionEnCours.getLibelle();
			System.out.println(numero + " " + libelleAction);

		}
		System.out.println(CHOIX_SORTIR + ". Quitter" + "\n");
	}

	public boolean choisir() {
		System.out.println("Veuillez choisir une option");
		int choix = 0;
		try {
			// Instructions susceptibles de provoquer des erreurs;

			choix = ihmHelper.saisirEntier();
			if (!actions.containsKey(choix)) {
				if (choix != CHOIX_SORTIR) {
					System.out.println("Erreur de saisie, veuillez recommencer!" + "\n");
				}
			} else {

				Action LaBonneAction = actions.get(choix);
				LaBonneAction.execute();

			}
		} catch (SaisieEntierException e) {
			System.out.println(e.getMessage());
		}

		return choix == CHOIX_SORTIR;
	}

}
