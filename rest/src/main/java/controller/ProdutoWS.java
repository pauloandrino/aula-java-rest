package controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Path;

import model.Produto;
import service.Service;

@Path("/produto")
public class ProdutoWS extends ModelWS<Produto> {

	@Override
	@Path("/create")
	public void create(Produto entity) {
		super.create(entity);
	}
	
	@Override
	@Path("/find")
	public Produto find(Produto entity) {
		return Produto.builder().id(1).build();
	}

	@Override
	@Path("/find-all")
	public List<Produto> findAll() {
		return super.findAll();
	}

	@Override
	@Path("/update")
	public void update(Produto entity) {
		super.update(entity);
	}

	@Override
	@Path("/delete")
	public void delete(Produto entity) {
		super.delete(entity);
	}
	
}
