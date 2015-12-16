package controller;

import junit.framework.TestCase;
import model.Categoria;

public class CategoriaWSTest extends TestCase {

	private CategoriaWS webService = new CategoriaWS();
	
	
	public void testCreateCategoria() {
		Categoria categoria = new Categoria();
		categoria.setNome("Casa");
		
		webService.create(categoria);
		
	}

}
