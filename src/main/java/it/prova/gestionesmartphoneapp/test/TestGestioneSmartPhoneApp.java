package it.prova.gestionesmartphoneapp.test;

import it.prova.gestionesmartphoneapp.service.AppService;
import it.prova.gestionesmartphoneapp.service.MyServiceFactory;
import it.prova.gestionesmartphoneapp.service.SmartPhoneService;

public class TestGestioneSmartPhoneApp {

	public static void main(String[] args) throws Exception {

		AppService appServiceInstance = MyServiceFactory.getAppServiceInstance();
		SmartPhoneService smartPhoneServiceInstance = MyServiceFactory.getSmartPhoneServiceInstance();

//		{
//		System.out.println("--------------Test get all apps metod-----------------");
//
//        try {
//            List<App> apps = appServiceInstance.getAll();
//            for (App app : apps) {
//                System.out.println(app.toString());
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//		{
//			System.out.println("--------------Test get all smartphone metod-----------------");
//
//			try {
//				List<SmartPhone> smartPhones = smartPhoneServiceInstance.getAll();
//				for (SmartPhone smartPhone : smartPhones) {
//					System.out.println(smartPhone.toString());
//				}
//
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		
		
		
		System.out.println("--------------Test get element app metod-----------------");
		
					try {
						System.out.println(appServiceInstance.getElemento(5L));
		
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
		
		
		
		

	}


