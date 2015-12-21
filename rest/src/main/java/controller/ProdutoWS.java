package controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Produto;
import service.ProdutoService;
import dao.DAO;

@Path("/produto")
public class ProdutoWS extends ModelWS<Produto> {

	public ProdutoWS() {
		this.service = new ProdutoService();
	}
	
	@Override
	@POST
	@Path("/create")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void create(Produto entity) {
		super.create(entity);
	}
	
	@Override
	@GET
	@Path("/find/{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Produto find(@PathParam("id") Integer id) {
		return Produto.builder().id(id).build();
	}
	
	@GET
	@Path("/find-product")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Produto find(Produto entity) {
		return null;
	}

	@Override
	@GET
	@Path("/find-all")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Produto> findAll() {
		
		DAO<Produto> dao = new DAO<Produto>(Produto.class);
		List<Produto> produtos = dao.findAll();
		
		return produtos;
	}

	@Override
	@POST
	@Path("/update")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void update(Produto entity) {
		super.update(entity);
	}

	@Override
	@DELETE
	@Path("/delete")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void delete(Produto entity) {
		super.delete(entity);
	}
	
}
