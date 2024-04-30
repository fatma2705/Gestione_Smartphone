package it.prova.gestionesmartphoneapp.dao;

import java.util.List;

import it.prova.gestionesmartphoneapp.model.App;
import it.prova.gestionesmartphoneapp.model.SmartPhone;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
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
	public void delete(SmartPhone smartphone) throws Exception {
		entityManager.remove(entityManager.merge(smartphone));

	}

	@Override
	public void deleteAppSmartPhoneAssociazione(SmartPhone smartphone) throws Exception {
		Query query = entityManager.createNativeQuery("DELETE FROM smartphone_app WHERE id_smartphone = :idSmartphone ");
		query.setParameter("idSmartphone", smartphone.getId());
		query.executeUpdate();

	}

	@Override
	public void updateVersioneOs(SmartPhone smartphone) throws Exception {
		SmartPhone existingSmartphone = this.getElement(smartphone.getId());
		existingSmartphone.setVersioneOs(smartphone.getVersioneOs());;
		entityManager.merge(existingSmartphone);
	}

	@Override
	public void aggiungiApp(SmartPhone smartPhone, App app) throws Exception {
		Query query = entityManager
				.createNativeQuery("INSERT INTO smartphone_app (id_app,id_smartphone) VALUES (:idApp,:idSmartphone)");
		query.setParameter("idApp", app.getId());
		query.setParameter("idSmartphone", smartPhone.getId());
		query.executeUpdate();
		
	}

	@Override
	public void rimuoviApp(SmartPhone smartPhone, App app) throws Exception {
		Query query = entityManager
				.createNativeQuery("DELETE FROM  smartphone_app  WHERE id_app = :idApp AND id_smartphone = :idSmartphone ");
		query.setParameter("idApp", app.getId());
		query.setParameter("idSmartphone", smartPhone.getId());
		query.executeUpdate();
	}
	

}
