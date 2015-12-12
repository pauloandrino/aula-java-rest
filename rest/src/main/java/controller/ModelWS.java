package controller;

import java.util.List;

import javax.inject.Inject;

import dao.DAO;
import exception.InvalidModelException;
import model.Model;
import service.Service;

public class ModelWS<T extends Model> {
	
	@Inject
	private Service<T> service;
	
	public void create(T entity) {
		try {
			DAO<T> dao = service.getDao(entity);
			dao.create(entity);
		} catch(InvalidModelException e) {
		}
	}
	
	public T find(T entity) {
		return service.getDao().find(entity);
	}
	
	public List<T> findAll() {
		return service.getDao().findAll();
	}
	
	public void update(T entity) {
		try{
			DAO<T> dao = service.getDao(entity);
			dao.update(entity);
		} catch(InvalidModelException e) {
		}
	}
	
	public void delete(T entity) {
		service.getDao().delete(entity);;
	}

}
