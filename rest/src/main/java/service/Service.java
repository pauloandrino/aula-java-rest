package service;

import javax.inject.Inject;

import dao.DAO;
import exception.InvalidModelException;
import validator.Validator;
import model.Model;

public class Service<T extends Model> {

	@Inject
	private Validator<T> validator;
	@Inject
	private DAO<T> dao;
	
	public DAO<T> getDao() {
		return dao;
	}
	
	public DAO<T> getDao(T entity) throws InvalidModelException {
		if(validator.validate(entity)) {
			return dao;
		} else {
			throw new InvalidModelException();
		}
	}
	
}
