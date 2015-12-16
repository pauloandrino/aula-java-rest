package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Categoria implements Model {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="categoria_id_sequence")
	@SequenceGenerator(name = "categoria_id_sequence", sequenceName = "CATEGORIA_ID_SEQ", allocationSize= 1)
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
