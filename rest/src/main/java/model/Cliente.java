package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="cliente_id_sequence")
	@SequenceGenerator(name = "cliente_id_sequence", sequenceName = "CLIENTE_ID_SEQ", allocationSize= 1)
	private Integer Id;
	private String nome;
	private String cpf; // ou a classe CPF // ou a classe documentos que contém todos os documentos
	private String endereco;
	@OneToOne
	private Usuario usuario;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
