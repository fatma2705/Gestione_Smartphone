package it.prova.gestionesmartphoneapp.dao;

import java.util.List;

import it.prova.gestionesmartphoneapp.model.SmartPhone;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class SmartPhoneDAOImpl implements SmartPhoneDAO {
	
	EntityManager entityManager;
	
	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;

	}

	@Override
	public List<SmartPhone> getAll() throws Exception {
			return entityManager.createQuery("SELECT DISTINCT s FROM SmartPhone s LEFT JOIN FETCH s.apps ", SmartPhone.class).getResultList();
			}

	@Override
	public SmartPhone getElement(Long id) throws Exception {
		TypedQuery<SmartPhone> query = entityManager
				.createQuery("SELECT s FROM SmartPhone s LEFT JOIN FETCH s.apps WHERE s.id = :id", SmartPhone.class);
		query.setParameter("id", id);
		return query.getSingleResult();
		}
	
	@Override
	public void update(SmartPhone smartphone) throws Exception {
		entityManager.merge(smartphone);
	}

	@Override
	public void insert(SmartPhone smartphone) throws Exception {
		entityManager.persist(smartphone);
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

	

}
