package service;

import dao.DAO;
import validator.Validator;
import model.Produto;

public class ProdutoService extends Service<Produto> {
	
	public ProdutoService() {
		this.validator = new Validator<Produto>() {
			
			@Override
			public boolean validate(Produto entity) {
				return true;
			}
		};
		
		this.dao = new DAO<Produto>(Produto.class);
	}

}
