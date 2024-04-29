package it.prova.gestionesmartphoneapp.service;

import java.util.List;

import it.prova.gestionesmartphoneapp.dao.AppDAO;
import it.prova.gestionesmartphoneapp.model.App;

public interface AppService {

	public List<App> getAll() throws Exception;

	public App getElemento(Long id) throws Exception;

	public void insert(App appInstance) throws Exception;

	public void delete(App appInstance) throws Exception;

	public void update(App appInstance) throws Exception;

	public void setAppDAO(AppDAO appInstance) throws Exception;

}
