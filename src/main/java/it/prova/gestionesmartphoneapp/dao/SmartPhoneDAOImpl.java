package it.prova.gestionesmartphoneapp.dao;

import java.util.List;

import it.prova.gestionesmartphoneapp.model.SmartPhone;
import jakarta.persistence.EntityManager;

public class SmartPhoneDAOImpl implements SmartPhoneDAO {
	
	EntityManager entityManager;

	@Override
	public List<SmartPhone> getAll() throws Exception {
		try {
			entityManager = EntityManagerUtil.getEntityManager();
			return entityManager.createQuery("SELECT DISTINCT s FROM SmartPhone s LEFT JOIN FETCH s.apps ", SmartPhone.class).getResultList();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}

	@Override
	public SmartPhone getElement(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(SmartPhone o) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(SmartPhone o) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(SmartPhone o) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exist(SmartPhone o) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SmartPhone getBy(String stringa) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAppSmartPhoneAssociazione(SmartPhone o) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEntityManager(EntityManager entityManager) {
		// TODO Auto-generated method stub

	}

}
