package controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import service.CategoriaService;
import model.Categoria;

@Path("/categoria")
public class CategoriaWS extends ModelWS<Categoria>{
	
	public CategoriaWS() {
		this.service = new CategoriaService();
	}

	@Override
	@POST
	@Path("/create")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void create(Categoria entity) {
		super.create(entity);
	}
}
