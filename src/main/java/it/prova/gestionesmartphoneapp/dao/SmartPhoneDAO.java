package it.prova.gestionesmartphoneapp.dao;

import it.prova.gestionesmartphoneapp.model.App;
import it.prova.gestionesmartphoneapp.model.SmartPhone;

public interface SmartPhoneDAO extends IBaseDAO<SmartPhone> {
	
	public void updateVersioneOs(SmartPhone smartphone) throws Exception;
	
	public void aggiungiApp(SmartPhone smartPhone, App app) throws Exception;
	
	public void rimuoviApp(SmartPhone smartPhone, App app) throws Exception;
	
	public SmartPhone caricaSingoloSmartphoneEagerFetchinAppConAppAssociate(Long id) throws Exception;
}
