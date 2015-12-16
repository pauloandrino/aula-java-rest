package service;

import model.Model;
import validator.Validator;
import dao.DAO;
import exception.InvalidModelException;

public class Service<T extends Model> {

	protected Validator<T> validator;
	protected DAO<T> dao;
	
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
