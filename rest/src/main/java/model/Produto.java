package model;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Produto implements Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_id_sequence")
	@SequenceGenerator(name = "produto_id_sequence", sequenceName = "PRODUTO_ID_SEQ", allocationSize = 1)
	private Integer id;
	private String nome;
	private String descricao;
	private byte foto;
	private BigDecimal valor;
	@OneToMany
	private Set<Categoria> categorias;
	
	public Produto() {
	}
	
	private Produto(Builder b) {
		this.id = b.id;
		this.nome = b.nome;
	}

	@Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public byte getFoto() {
		return foto;
	}

	public void setFoto(byte foto) {
		this.foto = foto;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Set<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(Set<Categoria> categorias) {
		this.categorias = categorias;
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
