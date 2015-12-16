package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="item_id_sequence")
	@SequenceGenerator(name = "item_id_sequence", sequenceName = "ITEM_ID_SEQ", allocationSize= 1)
	private Integer id;
	@OneToOne
	private Produto produto;
	private Integer quantidade;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
