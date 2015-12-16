package controller;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;
import model.Categoria;
import model.Produto;

public class ProdutoWSTest extends TestCase {

	ProdutoWS webService = new ProdutoWS();
	
	public void testCreateProduto() {
		Produto produto = new Produto();
		Set<Categoria> categorias = new HashSet<Categoria>();
		
		Categoria categoria = new Categoria();
		categoria.setId(2);
		
		categorias.add(categoria);
		
		
		produto.setNome("Teclado");
		produto.setCategorias(categorias);
		produto.setDescricao("Para digitar com mais facilidade");
		produto.setValor(BigDecimal.valueOf(155.99));

		webService.create(produto);
		
		
	}

	public void testFindInteger() {
		System.out.println("teste");
	}

	public void testFindProduto() {
		fail("Not yet implemented");
	}

	public void testFindAll() {
		fail("Not yet implemented");
	}

	public void testUpdateProduto() {
		fail("Not yet implemented");
	}

	public void testDeleteProduto() {
		fail("Not yet implemented");
	}

}
