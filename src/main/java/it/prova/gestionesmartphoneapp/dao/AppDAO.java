package it.prova.gestionesmartphoneapp.dao;

import it.prova.gestionesmartphoneapp.model.App;
import it.prova.gestionesmartphoneapp.model.SmartPhone;

public interface AppDAO extends IBaseDAO<App> {
	
	public App getByNome(String stringa)throws Exception;

	public void updateVersioneAppEDataAggiornamento(App app) throws Exception;

	public void aggiungiSmartphone(SmartPhone smartPhone, App app) throws Exception;

}
