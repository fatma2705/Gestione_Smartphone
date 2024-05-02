package it.prova.gestionesmartphoneapp.dao;

import java.util.List;

import jakarta.persistence.EntityManager;

public interface IBaseDAO<T> {

	public List<T> getAll() throws Exception;

	public T getElement(Long id) throws Exception;

	public void update(T o) throws Exception;

	public void insert(T o) throws Exception;

	public void delete(T o) throws Exception;

	public void deleteAppSmartPhoneAssociazione(T o) throws Exception;

	// questo mi serve per l'injection
	public void setEntityManager(EntityManager entityManager);

}
