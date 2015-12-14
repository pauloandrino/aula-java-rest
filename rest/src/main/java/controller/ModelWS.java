package controller;

import dao.DAO;
import exception.InvalidModelException;
import model.Model;
import service.Service;

import java.util.List;

public class ModelWS<T extends Model> {
	
	private Service<T> service;
	
	public void create(T entity) {
		try {
			DAO<T> dao = service.getDao(entity);
			dao.create(entity);
		} catch(InvalidModelException e) {
		}
	}
	
	public T find(Integer id) {
		return service.getDao().find(id);
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
