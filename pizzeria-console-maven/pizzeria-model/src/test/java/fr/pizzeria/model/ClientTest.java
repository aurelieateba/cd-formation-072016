package fr.pizzeria.model;

import org.junit.Assert;
import org.junit.Test;

import fr.pizzeria.exception.CreditException;

public class ClientTest {
	@Test
	public void TestCrediterCompte() throws CreditException {
		Client client = new Client();
		client.crediterCompte(10);
		Assert.assertTrue(client.getSolde() == 10);

	}

	@Test(expected = CreditException.class)
	public void TestCrediterCompteSoldeSuperieuSolde() throws CreditException {
		Client client = new Client();
		client.setSolde(Client.Seuil);
		client.crediterCompte(10);
	}
}
