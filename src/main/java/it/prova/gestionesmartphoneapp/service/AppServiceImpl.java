package it.prova.gestionesmartphoneapp.service;

import java.util.List;

import it.prova.gestionesmartphoneapp.dao.AppDAO;
import it.prova.gestionesmartphoneapp.dao.EntityManagerUtil;
import it.prova.gestionesmartphoneapp.model.App;
import jakarta.persistence.EntityManager;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(App appInstance) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(App appInstance) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(App appInstance) throws Exception {
		// TODO Auto-generated method stub

	}

	
}
