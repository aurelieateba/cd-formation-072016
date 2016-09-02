package fr.pizzeria.service;

import java.util.Collection;

import fr.pizzeria.model.Client;

public interface Stockage<T> {

	Collection<T> findAll();

	void save(T newElement);

	void update(T editElement, String code);

	void delete(String ancienCode);

	Client find(Integer clientChoisi);

}
