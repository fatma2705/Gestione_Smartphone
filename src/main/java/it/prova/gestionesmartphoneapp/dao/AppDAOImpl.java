package it.prova.gestionesmartphoneapp.dao;

import java.util.List;

import it.prova.gestionesmartphoneapp.model.App;
import jakarta.persistence.EntityManager;

public class AppDAOImpl implements AppDAO {
	
	EntityManager entityManager;
	
	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;

	}

	@Override
	public List<App> getAll() throws Exception {
		try {
			entityManager = EntityManagerUtil.getEntityManager();
			return entityManager.createQuery("SELECT DISTINCT a FROM App a JOIN FETCH a.smartphones ", App.class).getResultList();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}

	@Override
	public App getElement(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(App o) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(App o) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(App o) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exist(App o) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public App getBy(String stringa) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAppSmartPhoneAssociazione(App o) throws Exception {
		// TODO Auto-generated method stub

	}

	

}
