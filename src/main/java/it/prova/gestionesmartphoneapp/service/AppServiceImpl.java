package it.prova.gestionesmartphoneapp.service;

import java.util.List;

import it.prova.gestionesmartphoneapp.dao.AppDAO;
import it.prova.gestionesmartphoneapp.dao.EntityManagerUtil;
import it.prova.gestionesmartphoneapp.model.App;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class AppServiceImpl implements AppService {

	private AppDAO appDaoInstance;
	EntityManager entityManager;

	@Override
	public void setAppDAO(AppDAO appDaoInstance) throws Exception {
		this.appDaoInstance = appDaoInstance;
	}

	@Override
	public List<App> getAll() throws Exception {
		entityManager = EntityManagerUtil.getEntityManager();
		try {
			appDaoInstance.setEntityManager(entityManager);
			List<App> apps = appDaoInstance.getAll();
			if (apps.isEmpty()) {
				System.out.println("Database vuoto nulla da stampare");
				System.exit(0);
			}
			return apps;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			EntityManagerUtil.closeEntityManager(entityManager);
		}
	}

	@Override
	public App getElemento(Long id) throws Exception {
		entityManager = EntityManagerUtil.getEntityManager();
		try {
			if (id == null) {
				System.out.println("ID non inserito");
				System.exit(0);
			}
			appDaoInstance.setEntityManager(entityManager);
			App app = appDaoInstance.getElement(id);
			if (app == null) {
				System.out.println("Non esiste un' app con questo id");
				System.exit(0);
			}
			return app;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			EntityManagerUtil.closeEntityManager(entityManager);
		}
	}

	@Override
	public void insert(App appInstance) throws Exception {
		entityManager = EntityManagerUtil.getEntityManager();
		try {
			if (appInstance.equals(null)) {
				System.out.println("ERRORE: dati app non inseriti");
				System.exit(0);
			}
			if (appInstance.getId() != null) {
				System.out.println("ERRORE: id non  nullo");
				System.exit(0);
			}
			entityManager.getTransaction().begin();
			appDaoInstance.setEntityManager(entityManager);

			appDaoInstance.insert(appInstance);
			System.out.println("App inserita con successo");
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		} finally {
			EntityManagerUtil.closeEntityManager(entityManager);
		}

	}

	@Override
	public void delete(App appInstance) throws Exception {
		entityManager = EntityManagerUtil.getEntityManager();
		try {
			// controllo se sono stati inseriti i dati nella variabile genereInstance
			if (appInstance.getId() == null) {
				System.out.println("ERRORE: id app non inserito");
				System.exit(0);
			}
			entityManager.getTransaction().begin();

			appDaoInstance.setEntityManager(entityManager);
			// controllo se esiste un genere con questo id
			App existingApp = appDaoInstance.getElement(appInstance.getId());
			if (existingApp == null) {
				System.out.println("ERRORE: Non esiste un' app con questo id ");
				System.exit(0);
			}
//			// delete della associazione tra genere e brano
//			genereDaoInstance.deleteBranoGenereAssociazione(existingGenere);
//			System.out.println("Associazione tra Genere e brano rimossa");
			// infine delete del genere
			appDaoInstance.delete(appInstance);
			System.out.println("app rimossa dal DB");
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		} finally {
			EntityManagerUtil.closeEntityManager(entityManager);
		}
	}

	@Override
	public void update(App appInstance) throws Exception {
		EntityTransaction transaction = null;
		try {
			entityManager = EntityManagerUtil.getEntityManager();
			appDaoInstance.setEntityManager(entityManager);
			transaction = entityManager.getTransaction();
			transaction.begin();

			if (appInstance == null) {
				System.out.println("ERRORE: dati app non inseriti");
				return;
			}
			appDaoInstance.update(appInstance);

			transaction.commit();
			System.out.println("App updated successfully.");
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			throw e;
		} finally {
			if (entityManager != null && entityManager.isOpen()) {
				entityManager.close();
			}
		}
	}

	@Override
	public void getByNome(String nome) throws Exception {
		entityManager = EntityManagerUtil.getEntityManager();
		try {
			if (nome.equals(null)) {
				System.out.println("Non è stato inserito il nome dell'app da cercare");
				System.exit(0);
			}
			entityManager.getTransaction().begin();
			appDaoInstance.setEntityManager(entityManager);
			System.out.println(appDaoInstance.getBy(nome));
			entityManager.getTransaction().commit();
			System.out.println("Query get by nome eseguita correttamente");
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		} finally {
			EntityManagerUtil.closeEntityManager(entityManager);
		}
	}

	@Override
	public void updateVersioneAppEDataAggiornamento(App app) throws Exception {
		entityManager = EntityManagerUtil.getEntityManager();
		try {
			if(app.equals(null)) {
				System.out.println("Non sono stati inseriti i dati dell'applicazione");
				System.exit(0);
			}
			entityManager.getTransaction().begin();
			appDaoInstance.setEntityManager(entityManager);
			appDaoInstance.updateVersioneAppEDataAggiornamento(app);
			entityManager.getTransaction().commit();
			System.out.println("Versione e data aggiornamento aggiornate con successo");
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		} finally {
			EntityManagerUtil.closeEntityManager(entityManager);
		}
	}
}
