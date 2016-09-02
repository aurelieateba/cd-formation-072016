package fr.pizzeria.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class MainClassAnonyme {
	
	public static void main(String []args) throws IOException{
		
		// Création chemin d'un fichier data/pizza/test.txt
        Path cheminFichier = (Path) Paths.get("data","pizza","test.txt");
        
        // Création d'un nouveau fichier
        Files.createFile(cheminFichier);
        
        // Ecriture dans le fichier data/pizza/test.txt de 2 lignes
        Files.write(cheminFichier, Arrays.asList("ligne 1, Du texte...", "ligne 2 --- "));
        
        // Parcourir les lignes d'un fichier
        Files.lines((java.nio.file.Path) cheminFichier).forEach(System.out::println);
        
        // parcourir le répertoire data/pizza
        Files.list(Paths.get("data", "pizza")).forEach(p -> System.out.println(p.getFileName()));
	}

}
