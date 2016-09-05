package fr.pizzeria.ihm;
//
//public class ActionCreationChaquePizza {
//	
//	
//import fr.pizzeria.ihm.Action;
//import fr.pizzeria.ihm.IhmHelper;
//import fr.pizzeria.model.Pizza;
//
//	public class ActionCreationChaquePizza extends Action {
//
//		public AjouterPizzaAction(IhmHelper helper) {
//			super("Creéer chaque pizza", helper);
//		}
//
//		@Override
//		public void execute() {
//
//			// récuperation de la saisie
//			System.out.println("Vous voulez ajoutez une pizza");
//			System.out.println("Veuillez saisir le code");
//			String code = helper.getScanner().next();
//			System.out.println("Veuillez saisir le nom de la pizza");
//			String nom = helper.getScanner().next();
//			System.out.println("Veuillez saisir le prix de la pizza");
//			double prix = helper.getScanner().nextDouble();
//			// creation de la nouvelle pizza
//			Pizza nouvellePizza = new Pizza(code, nom, prix);
//			helper.getStockage().save(nouvellePizza);
//
//			System.out.println("Pizza ajouter avec succes" + "\n");
//			
//			
//			
//
//		}
//	
//	
//
//}
