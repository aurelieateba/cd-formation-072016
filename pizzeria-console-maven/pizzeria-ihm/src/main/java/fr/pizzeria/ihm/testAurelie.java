package fr.pizzeria.ihm;

import java.util.HashMap;
import java.util.Map;

import fr.pizzeria.exception.SaisieEntierException;


public class testAurelie {

	private static final int CHOIX_SORTIR = 99;
	private Map<Integer, Action> actions = new HashMap<>();
	private IhmHelper ihmHelper;

	public testAurelie(IhmHelper helper) {
		this.actions.put(1, (Action) new ListerPizzaAction(helper));
		this.actions.put(2, new AjouterPizzaAction(helper));
		this.actions.put(3, new ModifierPizzaAction(helper));
		this.actions.put(4, new SupprimerPizzaAction(helper));
		this.actions.put(5, new ActionDebiterClient(helper));
		this.actions.put(6, new ActionCrediterClient(helper));
		this.actions.put(7, new ActionListerClients(helper));
		
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

		
		actions.forEach((numero , valeur)-> {
			Action ActionEnCours = valeur;
			String libelleAction = ActionEnCours.getLibelle();
			System.out.println(numero + " " + libelleAction);

		});
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
