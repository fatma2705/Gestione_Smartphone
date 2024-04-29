package it.prova.gestionesmartphoneapp.dao;

public class MyDAOFactory {
	private static AppDAO appDaoInstance;
	private static SmartPhoneDAO smartPhoneDaoInstance;

	public static AppDAO getAppDaoInstance() {
		if (appDaoInstance == null) {
			appDaoInstance = new AppDAOImpl();
		}
		return appDaoInstance;

	}

	public static SmartPhoneDAO getSmartPhoneDAOInstance() {
		if (smartPhoneDaoInstance == null) {

			smartPhoneDaoInstance = new SmartPhoneDAOImpl();
		}
		return smartPhoneDaoInstance;
	}

}
