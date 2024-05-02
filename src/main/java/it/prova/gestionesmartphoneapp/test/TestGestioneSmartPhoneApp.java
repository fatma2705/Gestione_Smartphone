package it.prova.gestionesmartphoneapp.test;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import it.prova.gestionesmartphoneapp.model.App;
import it.prova.gestionesmartphoneapp.model.SmartPhone;
import it.prova.gestionesmartphoneapp.service.AppService;
import it.prova.gestionesmartphoneapp.service.MyServiceFactory;
import it.prova.gestionesmartphoneapp.service.SmartPhoneService;

public class TestGestioneSmartPhoneApp {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
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
			System.out.print("Inserisci l'ID dell'app: ");
			Long idApp = scanner.nextLong();
			App app = appServiceInstance.getElemento(idApp);
			System.out.println(app);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo update() per le app
		System.out.println("Test: update() per le app");
		try {
			System.out.print("Inserisci l'ID dell'app da aggiornare: ");
			Long idApp = scanner.nextLong();
			scanner.nextLine(); // Consuma il newline
			System.out.print("Inserisci il nuovo nome: ");
			String nuovoNome = scanner.nextLine();
			System.out.print("Inserisci la nuova data di rilascio (AAAA-MM-GG): ");
			LocalDate nuovaDataRilascio = LocalDate.parse(scanner.nextLine());
			System.out.print("Inserisci la nuova data di aggiornamento (AAAA-MM-GG): ");
			LocalDate nuovaDataAggiornamento = LocalDate.parse(scanner.nextLine());
			System.out.print("Inserisci la nuova versione: ");
			String nuovaVersione = scanner.nextLine();

			App app = new App(idApp, nuovoNome, nuovaDataRilascio, nuovaDataAggiornamento, nuovaVersione);
			appServiceInstance.update(app);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo insert() per le app
		System.out.println("Test: insert() per le app");
		try {
			System.out.print("Inserisci il nome della nuova app: ");
			String nomeApp = scanner.nextLine();
			System.out.print("Inserisci la data di rilascio (AAAA-MM-GG): ");
			LocalDate dataRilascio = LocalDate.parse(scanner.nextLine());
			System.out.print("Inserisci la data di aggiornamento (AAAA-MM-GG): ");
			LocalDate dataAggiornamento = LocalDate.parse(scanner.nextLine());
			System.out.print("Inserisci la versione: ");
			String versione = scanner.nextLine();

			App nuovaApp = new App(null, nomeApp, dataRilascio, dataAggiornamento, versione);
			appServiceInstance.insert(nuovaApp);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo delete() per le app
		System.out.println("Test: delete() per le app");
		try {
			System.out.print("Inserisci l'ID dell'app da eliminare: ");
			Long idAppDaEliminare = scanner.nextLong();
			appServiceInstance.delete(new App(idAppDaEliminare));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo getByNome() per le app
		System.out.println("Test: getByNome() per le app");
		try {
			System.out.print("Inserisci il nome dell'app da cercare: ");
			String nomeApp = scanner.nextLine();
			appServiceInstance.getByNome(nomeApp);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo updateVersioneAppEDataAggiornamento() per le app
		System.out.println("Test: updateVersioneAppEDataAggiornamento() per le app");
		try {
			System.out.print("Inserisci l'ID dell'app da aggiornare: ");
			Long idApp = scanner.nextLong();
			scanner.nextLine(); // Consuma il newline
			System.out.print("Inserisci la nuova versione: ");
			String nuovaVersione = scanner.nextLine();
			System.out.print("Inserisci la nuova data di aggiornamento (AAAA-MM-GG): ");
			LocalDate nuovaDataAggiornamento = LocalDate.parse(scanner.nextLine());

			App app = new App(idApp, nuovaDataAggiornamento, nuovaVersione);
			appServiceInstance.updateVersioneAppEDataAggiornamento(app);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo aggiungiSmartphone() per le app
		System.out.println("Test: aggiungiSmartphone() per le app");
		try {
			System.out.print("Inserisci l'ID dell'app: ");
			Long idApp = scanner.nextLong();
			System.out.print("Inserisci l'ID dello smartphone: ");
			Long idSmartphone = scanner.nextLong();
			appServiceInstance.aggiungiSmartphone(new SmartPhone(idSmartphone), new App(idApp));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo getAll() per gli smartphone
		System.out.println("Test: getAll() per gli smartphone");
		try {
			List<SmartPhone> smartphones = smartPhoneServiceInstance.getAll();
			for (SmartPhone smartphone : smartphones) {
				System.out.println(smartphone.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo getElemento() per gli smartphone
		System.out.println("Test: getElemento() per gli smartphone");
		try {
			System.out.print("Inserisci l'ID dello smartphone: ");
			Long idSmartphone = scanner.nextLong();
			SmartPhone smartphone = smartPhoneServiceInstance.getElemento(idSmartphone);
			System.out.println(smartphone);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo update() per gli smartphone
		System.out.println("Test: update() per gli smartphone");
		try {
			System.out.print("Inserisci l'ID dello smartphone da aggiornare: ");
			Long idSmartphone = scanner.nextLong();
			scanner.nextLine(); // Consuma il newline
			System.out.print("Inserisci la marca: ");
			String marca = scanner.nextLine();
			System.out.print("Inserisci il modello: ");
			String modello = scanner.nextLine();
			System.out.print("Inserisci il prezzo: ");
			float prezzo = scanner.nextFloat();
			scanner.nextLine(); // Consuma il newline
			System.out.print("Inserisci la versione del sistema operativo: ");
			String versioneOs = scanner.nextLine();

			SmartPhone smartphone = new SmartPhone(idSmartphone, marca, modello, prezzo, versioneOs);
			smartPhoneServiceInstance.update(smartphone);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo insert() per gli smartphone
		System.out.println("Test: insert() per gli smartphone");
		try {
			System.out.print("Inserisci la marca: ");
			String marca = scanner.nextLine();
			System.out.print("Inserisci il modello: ");
			String modello = scanner.nextLine();
			System.out.print("Inserisci il prezzo: ");
			float prezzo = scanner.nextFloat();
			scanner.nextLine(); // Consuma il newline
			System.out.print("Inserisci la versione del sistema operativo: ");
			String versioneOs = scanner.nextLine();

			SmartPhone smartphone = new SmartPhone(null, marca, modello, prezzo, versioneOs);
			smartPhoneServiceInstance.insert(smartphone);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo delete() per gli smartphone
		System.out.println("Test: delete() per gli smartphone");
		try {
			System.out.print("Inserisci l'ID dello smartphone da eliminare: ");
			Long idSmartphoneDaEliminare = scanner.nextLong();
			smartPhoneServiceInstance.delete(new SmartPhone(idSmartphoneDaEliminare));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo updateVersioneOs() per gli smartphone
		System.out.println("Test: updateVersioneOs() per gli smartphone");
		try {
			System.out.print("Inserisci l'ID dello smartphone: ");
			Long idSmartphone = scanner.nextLong();
			scanner.nextLine(); // Consuma il newline
			System.out.print("Inserisci la nuova versione del sistema operativo: ");
			String nuovaVersioneOs = scanner.nextLine();

			SmartPhone smartphone = new SmartPhone(idSmartphone, nuovaVersioneOs);
			smartPhoneServiceInstance.updateVersioneOs(smartphone);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo aggiungiApp() per gli smartphone
		System.out.println("Test: aggiungiApp() per gli smartphone");
		try {
			System.out.print("Inserisci l'ID dello smartphone: ");
			Long idSmartphone = scanner.nextLong();
			System.out.print("Inserisci l'ID dell'app: ");
			Long idApp = scanner.nextLong();
			smartPhoneServiceInstance.aggiungiApp(new SmartPhone(idSmartphone), new App(idApp));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo rimuoviApp() per gli smartphone
		System.out.println("Test: rimuoviApp() per gli smartphone");
		try {
			System.out.print("Inserisci l'ID dello smartphone: ");
			Long idSmartphone = scanner.nextLong();
			System.out.print("Inserisci l'ID dell'app: ");
			Long idApp = scanner.nextLong();
			smartPhoneServiceInstance.rimuoviApp(new SmartPhone(idSmartphone), new App(idApp));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Test del metodo caricaSingoloSmartphoneEagerFetchinAppConAppAssociate() per
		// gli smartphone
		System.out.println("Test: caricaSingoloSmartphoneEagerFetchinAppConAppAssociate() per gli smartphone");
		try {
			System.out.print("Inserisci l'ID dello smartphone: ");
			Long idSmartphone = scanner.nextLong();
			SmartPhone res = smartPhoneServiceInstance
					.caricaSingoloSmartphoneEagerFetchinAppConAppAssociate(idSmartphone);
			System.out.println(res.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
