package it.prova.gestionesmartphoneapp.test;

import java.time.LocalDate;
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

		System.out.println("--------------Test Gestione Smartphone App-----------------");

		// Test AppService

		// Test del metodo getAll() per le app
		System.out.println("Test: getAll() per le app");
		try {
			List<App> apps = appServiceInstance.getAll();
			for (App app : apps) {
				System.out.println(app.toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo getElemento() per le app
		System.out.println("Test: getElemento() per le app");
		try {
			System.out.println(appServiceInstance.getElemento(5L));

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo update() per le app
		System.out.println("Test: update() per le app");
		try {
			App app = new App(2L, "MrrrrrrrryApp", LocalDate.of(2022, 10, 15), LocalDate.of(2024, 4, 28), "1.2.3");
			appServiceInstance.update(app);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo insert() per le app
		System.out.println("Test: insert() per le app");
		try {
			App app = new App(null, "lukino", LocalDate.of(2002, 11, 17), LocalDate.of(2074, 8, 12), "0.0.0");
			appServiceInstance.insert(app);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo delete() per le app
		System.out.println("Test: delete() per le app");
		try {
			App app = new App(20L);
			appServiceInstance.delete(app);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo getByNome() per le app
		System.out.println("Test: getByNome() per le app");
		try {
			appServiceInstance.getByNome("lukino");

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo updateVersioneAppEDataAggiornamento() per le app
		System.out.println("Test: updateVersioneAppEDataAggiornamento() per le app");
		try {
			App app = new App(10L, LocalDate.of(2003, 05, 27), "3.363.9");
			appServiceInstance.updateVersioneAppEDataAggiornamento(app);
			;

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo aggiungiSmartphone() per le app
		System.out.println("Test: aggiungiSmartphone() per le app");
		try {
			App app = new App(10L);
			SmartPhone smartphone = new SmartPhone(8L);
			appServiceInstance.aggiungiSmartphone(smartphone, app);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test SmartPhoneService

		// Test del metodo getAll() per gli smartphone
		System.out.println("Test: getAll() per gli smartphone");
		try {
			List<SmartPhone> smartPhones = smartPhoneServiceInstance.getAll();
			for (SmartPhone smartPhone : smartPhones) {
				System.out.println(smartPhone.toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo getElemento() per gli smartphone
		System.out.println("Test: getElemento() per gli smartphone");
		try {
			System.out.println(smartPhoneServiceInstance.getElemento(9L));

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo update() per gli smartphone
		System.out.println("Test: update() per gli smartphone");
		try {
			SmartPhone smartphone = new SmartPhone(1L, "Samsung", "Galaxy S21", 999.99f, "Android 12");
			smartPhoneServiceInstance.update(smartphone);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo insert() per gli smartphone
		System.out.println("Test: insert() per gli smartphone");
		try {
			SmartPhone smartphone = new SmartPhone(null, "Samsung", "Galaxy S21", 999.99f, "Android 12");
			smartPhoneServiceInstance.insert(smartphone);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo delete() per gli smartphone
		System.out.println("Test: delete() per gli smartphone");
		try {
			SmartPhone smartphone = new SmartPhone(6L);
			smartPhoneServiceInstance.delete(smartphone);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo updateVersioneOs() per gli smartphone
		System.out.println("Test: updateVersioneOs() per gli smartphone");
		try {
			SmartPhone smartphone = new SmartPhone(8L, "IOS%&");
			smartPhoneServiceInstance.updateVersioneOs(smartphone);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo aggiungiApp() per gli smartphone
		System.out.println("Test: aggiungiApp() per gli smartphone");
		try {
			App app = new App(10L);
			SmartPhone smartphone = new SmartPhone(10L);
			smartPhoneServiceInstance.aggiungiApp(smartphone, app);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo rimuoviApp() per gli smartphone
		System.out.println("Test: rimuoviApp() per gli smartphone");
		try {
			App app = new App(10L);
			SmartPhone smartphone = new SmartPhone(10L);
			smartPhoneServiceInstance.rimuoviApp(smartphone, app);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo caricaSingoloSmartphoneEagerFetchinAppConAppAssociate() per
		// gli smartphone
		System.out.println("Test: caricaSingoloSmartphoneEagerFetchinAppConAppAssociate() per gli smartphone");
		try {
			SmartPhone res = smartPhoneServiceInstance.caricaSingoloSmartphoneEagerFetchinAppConAppAssociate(9L);
			System.out.println(res.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
