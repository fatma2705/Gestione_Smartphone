package it.prova.gestionesmartphoneapp.service;

import it.prova.gestionesmartphoneapp.dao.MyDAOFactory;

public class MyServiceFactory {

	private static AppService appServiceInstance;
	private static SmartPhoneService smartPhoneServiceInstance;

	public static SmartPhoneService getSmartPhoneServiceInstance() {
		if (smartPhoneServiceInstance == null)
			smartPhoneServiceInstance = new SmartPhoneServiceImpl();

		try {
			smartPhoneServiceInstance.setSmartPhoneDAO(MyDAOFactory.getSmartPhoneDAOInstance());
			;
			smartPhoneServiceInstance.setAppDAO(MyDAOFactory.getAppDaoInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return smartPhoneServiceInstance;

	}

	public static AppService getAppServiceInstance() {
		if (appServiceInstance == null)
			appServiceInstance = new AppServiceImpl();

		try {

			appServiceInstance.setAppDAO(MyDAOFactory.getAppDaoInstance());
		} catch (Exception e) {

			e.printStackTrace();
		}
		return appServiceInstance;
	}

}
