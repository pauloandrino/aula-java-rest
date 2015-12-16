package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categoria implements Model {

	@Id
	private Integer id;
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public Integer getId() {
		return id;
	}
	

}
