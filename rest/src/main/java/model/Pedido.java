package model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_id_sequence")
	@SequenceGenerator(name = "pedido_id_sequence", sequenceName = "PEDIDO_ID_SEQ", allocationSize = 1)
	private Integer id;
	private Date data;
	@OneToOne
	private Cliente cliente;
	@OneToMany
	private Set<Item> itens;
	private BigDecimal valorTotal;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<Item> getItens() {
		return itens;
	}

	public void setItens(Set<Item> itens) {
		this.itens = itens;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

}
