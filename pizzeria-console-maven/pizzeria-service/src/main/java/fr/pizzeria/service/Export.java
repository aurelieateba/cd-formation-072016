package fr.pizzeria.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;

import fr.pizzeria.exception.ServiceException;
import fr.pizzeria.model.Client;
import fr.pizzeria.model.Pizza;

public class Export implements Stockage<Pizza> {

	@Override
	public Collection<Pizza> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Pizza newElement) {
		// TODO Auto-generated method stub
		// Création chemin d'un fichier data/pizza/test.txt
        Path cheminFichier = Paths.get("data", "Pizza", newElement.getCode() + ".txt");

        // Ecriture dans le fichier data/pizza/test.txt de 2 lignes
        try {

            // Création d'un nouveau fichier
            Files.createFile(cheminFichier);
            Files.write(cheminFichier,
                    Arrays.asList(newElement.getNom() + ";" + newElement.getPrix() + ";" ));
        } catch (IOException e) {
            throw new ServiceException(e);
        }
	}

	@Override
	public void update(Pizza editElement, String code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String ancienCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client find(Integer clientChoisi) {
		// TODO Auto-generated method stub
		return null;
	}



}
