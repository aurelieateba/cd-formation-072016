package fr.pizzeria.exception;

public class DebitException extends Exception {


	private static final String MSG = "Lancer l'exception si le solde est n�gatif � l'issu du d�bit !";

	public DebitException() {
		super(MSG);
		// TODO Auto-generated constructor stub
	}

	public DebitException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DebitException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DebitException(Throwable cause) {
		super(MSG, cause);
		// TODO Auto-generated constructor stub
	}

}

