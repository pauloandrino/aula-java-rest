package service;

import validator.Validator;
import dao.DAO;
import model.Categoria;

public class CategoriaService extends Service<Categoria>{

	public CategoriaService() {
		this.dao = new DAO<Categoria>(Categoria.class);
		this.validator = new Validator<Categoria>() {
			
			@Override
			public boolean validate(Categoria entity) {
				return true;
			}
		};
	}
}
