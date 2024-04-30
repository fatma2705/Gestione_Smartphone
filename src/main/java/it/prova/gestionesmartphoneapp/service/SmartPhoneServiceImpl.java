package it.prova.gestionesmartphoneapp.service;

import java.util.List;

import it.prova.gestionesmartphoneapp.dao.AppDAO;
import it.prova.gestionesmartphoneapp.dao.EntityManagerUtil;
import it.prova.gestionesmartphoneapp.dao.SmartPhoneDAO;
import it.prova.gestionesmartphoneapp.model.SmartPhone;
import jakarta.persistence.EntityManager;

public class SmartPhoneServiceImpl implements SmartPhoneService {

	SmartPhoneDAO smartPhoneDaoInstance;
	AppDAO appDaoInstance;
	EntityManager entityManager;

	@Override
	public void setSmartPhoneDAO(SmartPhoneDAO smartPhoneInstanceDao) throws Exception {
		this.smartPhoneDaoInstance = smartPhoneInstanceDao;

	}

	@Override
	public void setAppDAO(AppDAO appInstanceDao) throws Exception {
		this.appDaoInstance = appInstanceDao;

	}

	@Override
	public List<SmartPhone> getAll() throws Exception {
		entityManager = EntityManagerUtil.getEntityManager();
		try {
			smartPhoneDaoInstance.setEntityManager(entityManager);
			List<SmartPhone> smartPhones = smartPhoneDaoInstance.getAll();
			if (smartPhones.isEmpty()) {
				System.out.println("Database vuoto nulla da stampare");
				System.exit(0);
			}

			return smartPhones;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			EntityManagerUtil.closeEntityManager(entityManager);
		}
	}

	@Override
	public SmartPhone getElemento(Long id) throws Exception {
//		entityManager = EntityManagerUtil.getEntityManager();
//		try {
//			if (id == null) {
//				System.out.println(" id smartphone non inserito correttamente");
//			}
//			entityManager.getTransaction().begin();
//			smartPhoneDaoInstance.setEntityManager(entityManager);
//			return smartPhoneDaoInstance.getElement(id);
//			entityManager.getTransaction().commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw e;
//		} finally {
//			EntityManagerUtil.closeEntityManager(entityManager);
//		}
	}


	@Override
	public void insert(SmartPhone smartPhoneInstance) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(SmartPhone smartPhoneInstance) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(SmartPhone smartPhoneInstance) throws Exception {
		// TODO Auto-generated method stub

	}

}
