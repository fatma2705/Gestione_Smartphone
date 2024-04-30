package it.prova.gestionesmartphoneapp.test;

import java.util.List;

import it.prova.gestionesmartphoneapp.model.App;
import it.prova.gestionesmartphoneapp.model.SmartPhone;
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

		
//		
//		System.out.println("--------------Test get element app metod-----------------");
//		
//					try {
//						System.out.println(appServiceInstance.getElemento(5L));
//		
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				
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
					
					
//					
//					System.out.println("--------------Test insert element app metod-----------------");
//					
//					try {
//						 App app = new App(null, "lukino", LocalDate.of(2002, 11, 17), LocalDate.of(2074, 8, 12), "0.0.0");
//						appServiceInstance.insert(app);
//		
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				
					
//					System.out.println("--------------Test delete element app metod-----------------");
//					
//					try {
//						 App app = new App(20L);
//						appServiceInstance.delete(app);
//		
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//
//		
//		System.out.println("--------------Test get by nome app metod-----------------");
//		
//		try {
//			appServiceInstance.getByNome("lukino");;
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
//		System.out.println("--------------Test update versione e data aggiornamento app metod-----------------");
//		
//		try {
//			
//			App app = new App(10L,LocalDate.of(2003, 05, 27),"3.363.9");
//			appServiceInstance.updateVersioneAppEDataAggiornamento(app);;
//			
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
//		System.out.println("--------------Test insert smartphone all'app aggiornamento app metod-----------------");
//		
//		try {
//			
//			App app = new App(10L);
//			SmartPhone smartphone = new SmartPhone(8L);
//			appServiceInstance.aggiungiSmartphone(smartphone, app);
//			
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		
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
//		
		System.out.println("--------------Test get element smartphone metod-----------------");
		
					try {
						System.out.println(smartPhoneServiceInstance.getElemento(5L));
		
					} catch (Exception e) {
						e.printStackTrace();
					}
				
	

	
	
		
		
		
		

	}
}

