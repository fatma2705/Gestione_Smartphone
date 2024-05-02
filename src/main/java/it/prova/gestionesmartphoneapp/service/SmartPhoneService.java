package it.prova.gestionesmartphoneapp.service;

import java.util.List;

import it.prova.gestionesmartphoneapp.dao.AppDAO;
import it.prova.gestionesmartphoneapp.dao.SmartPhoneDAO;
import it.prova.gestionesmartphoneapp.model.App;
import it.prova.gestionesmartphoneapp.model.SmartPhone;

public interface SmartPhoneService {

	public List<SmartPhone> getAll() throws Exception;

	public SmartPhone getElemento(Long id) throws Exception;

	public void insert(SmartPhone smartPhoneInstance) throws Exception;

	public void delete(SmartPhone smartPhoneInstance) throws Exception;

	public void update(SmartPhone smartPhoneInstance) throws Exception;

	public void updateVersioneOs(SmartPhone smartphone) throws Exception;

	public void aggiungiApp(SmartPhone smartPhone, App app) throws Exception;

	public void rimuoviApp(SmartPhone smartPhone, App app) throws Exception;

	public SmartPhone caricaSingoloSmartphoneEagerFetchinAppConAppAssociate(Long id) throws Exception;

	public void setSmartPhoneDAO(SmartPhoneDAO smartPhoneInstanceDao) throws Exception;

	public void setAppDAO(AppDAO appInstanceDao) throws Exception;

}
