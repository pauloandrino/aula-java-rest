package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Produto implements Model {
	
	@Id
	private Integer id;
	private String nome;
	
	public Produto() {
	}
	
	private Produto(Builder b) {
		this.id = b.id;
		this.nome = b.nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		
		private Integer id;
		private String nome;
		
		private Builder() {
		}
		
		public Builder id(Integer id) {
			this.id = id;
			return this;
		}
		
		public Builder nome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public Produto build() {
			return new Produto(this);
		}
		
	}

}
