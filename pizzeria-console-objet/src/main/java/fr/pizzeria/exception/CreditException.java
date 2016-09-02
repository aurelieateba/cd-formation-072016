package fr.pizzeria.exception;

public class CreditException extends Exception {

	private static final String MSG = "Lancer l'exception si le solde > 5000 !";

	public CreditException() {
		super(MSG);
		// TODO Auto-generated constructor stub
	}

	public CreditException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CreditException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CreditException(Throwable cause) {
		super(MSG, cause);
		// TODO Auto-generated constructor stub
	}

}



