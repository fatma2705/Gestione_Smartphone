package it.prova.gestionesmartphoneapp.test;

import java.time.LocalDate;

import it.prova.gestionesmartphoneapp.model.App;
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
		
		
//		
		System.out.println("--------------Test get element app metod-----------------");
		
					try {
						System.out.println(appServiceInstance.getElemento(5L));
		
					} catch (Exception e) {
						e.printStackTrace();
					}
				
////	
//	
		
		
//		System.out.println("--------------Test update element app metod-----------------");
//		
//		try {
//			 App app = new App(2L, "MrrrrrrrryApp", LocalDate.of(2022, 10, 15), LocalDate.of(2024, 4, 28), "1.2.3");
//			appServiceInstance.update(app);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
					
					
					
					System.out.println("--------------Test insert element app metod-----------------");
					
					try {
						 App app = new App(null, "lukino", LocalDate.of(2002, 11, 17), LocalDate.of(2074, 8, 12), "0.0.0");
						appServiceInstance.insert(app);
		
					} catch (Exception e) {
						e.printStackTrace();
					}
				


	
	
		
		
		
		

	}
}

