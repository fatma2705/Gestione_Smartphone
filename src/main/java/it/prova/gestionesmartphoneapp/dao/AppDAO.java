package it.prova.gestionesmartphoneapp.dao;

import it.prova.gestionesmartphoneapp.model.App;

public interface AppDAO extends IBaseDAO<App> {
	
	public void updateVersioneAppEDataAggiornamento(App app) throws Exception;

}
