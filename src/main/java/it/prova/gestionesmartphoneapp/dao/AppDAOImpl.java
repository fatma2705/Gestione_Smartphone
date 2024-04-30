package it.prova.gestionesmartphoneapp.dao;

import java.util.List;

import it.prova.gestionesmartphoneapp.model.App;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class AppDAOImpl implements AppDAO {
	
	// entity manager non deve essere inizializzato nello strato DAO ma nel strato dei service 
	// dentro al DAO le funzioni devo essere più secche entityManager.function() 
	// eccezioni e gestione di entity manager tutto nel strato service 
	// non ti scordare di settare l'entity manager nella function del service prima di 
	// chiamare la function del DAO

	EntityManager entityManager;

	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;

	}

	@Override
	public List<App> getAll() throws Exception {
		return entityManager.createQuery("SELECT DISTINCT a FROM App a LEFT JOIN FETCH a.smartPhones ", App.class)
				.getResultList();
		}

	@Override
	public App getElement(Long id) throws Exception {
		TypedQuery<App> query = entityManager
				.createQuery("SELECT a FROM App a LEFT JOIN FETCH a.smartPhones WHERE a.id = :id", App.class);
		query.setParameter("id", id);
		return query.getSingleResult();
	}

	@Override
	public void update(App app) throws Exception {
		entityManager.merge(app);
	}

	@Override
	public void insert(App app) throws Exception {
			entityManager.persist(app);
	}

	@Override
	public void delete(App app) throws Exception {
			entityManager.remove(entityManager.merge(app));
	}

	@Override
	public boolean exist(App o) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public App getBy(String stringa) throws Exception {
		TypedQuery<App> query = entityManager
				.createQuery("SELECT a FROM App a LEFT JOIN FETCH a.smartPhones WHERE a.nome = :nome", App.class);
		query.setParameter("nome", stringa);
		return query.getSingleResult();
	}
	@Override
	public void deleteAppSmartPhoneAssociazione(App o) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateVersioneAppEDataAggiornamento(App app) throws Exception {
		App existingApp = this.getElement(app.getId());
		existingApp.setDataUltimoAggiornamento(app.getDataUltimoAggiornamento());
		existingApp.setVersione(app.getVersione());
		entityManager.merge(existingApp);
		
	}

}
