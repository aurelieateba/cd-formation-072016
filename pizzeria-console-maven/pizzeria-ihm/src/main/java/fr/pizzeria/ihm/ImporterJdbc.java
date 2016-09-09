package fr.pizzeria.ihm;

public class ImporterJdbc extends Action {

	public ImporterJdbc(IhmHelper helper) {
		super("importer", helper);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		super.execute();
		System.out.println("import" );
		// On cree l'action Ajouter un nouveau menu
		ImporterJdbc actionAjouterNouveauMenu = new ImporterJdbc(helper);
	}
     
}
