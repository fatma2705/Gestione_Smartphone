package it.prova.gestionesmartphoneapp.dao;

import java.util.List;

import it.prova.gestionesmartphoneapp.model.App;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

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
			return entityManager.createQuery("SELECT DISTINCT a FROM App a LEFT JOIN FETCH a.smartPhones ", App.class)
					.getResultList();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}

	@Override
	public App getElement(Long id) throws Exception {
		try {
			entityManager = EntityManagerUtil.getEntityManager();
			TypedQuery<App> query = entityManager
					.createQuery("SELECT a FROM App a LEFT JOIN FETCH a.smartPhones WHERE a.id = :id", App.class);
			query.setParameter("id", id);
			return query.getSingleResult();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}

	@Override
	public void update(App app) throws Exception {
		try {
			entityManager = EntityManagerUtil.getEntityManager();
			if (app == null) {
				throw new Exception("Impossibile eseguire l'update nel DB. Input non valido");
			}
			entityManager.merge(app);
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}

	@Override
	public void insert(App app) throws Exception {
		try {

			entityManager = EntityManagerUtil.getEntityManager();
			if (app == null) {
				throw new Exception("Errore valore input");
			}
			entityManager.persist(app);
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}

	@Override
	public void delete(App app) throws Exception {
		try {
			entityManager = EntityManagerUtil.getEntityManager();
			if (app == null) {
				throw new Exception("Impossibile eseguire la delete nel DB. Input non valido");
			}
			entityManager.remove(entityManager.merge(app));
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
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
