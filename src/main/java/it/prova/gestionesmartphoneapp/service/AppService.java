package it.prova.gestionesmartphoneapp.service;

import java.util.List;

import it.prova.gestionesmartphoneapp.dao.AppDAO;
import it.prova.gestionesmartphoneapp.dao.SmartPhoneDAO;
import it.prova.gestionesmartphoneapp.model.App;
import it.prova.gestionesmartphoneapp.model.SmartPhone;

public interface AppService {

	public List<App> getAll() throws Exception;

	public App getElemento(Long id) throws Exception;

	public void insert(App appInstance) throws Exception;

	public void delete(App appInstance) throws Exception;

	public void update(App appInstance) throws Exception;

	public void getByNome(String nome) throws Exception;

	public void updateVersioneAppEDataAggiornamento(App app) throws Exception;

	public void aggiungiSmartphone(SmartPhone smartPhone, App app) throws Exception;

	public void setAppDAO(AppDAO appInstance) throws Exception;

}
