package entities;

public class ItemPedido {
	
	Integer quantidade;
	Double preço;
	Produto produto;

	public ItemPedido() {
	}

	public ItemPedido(Integer quantidade, Double preço, Produto produto) {
		this.quantidade = quantidade;
		this.preço = preço;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		return preço * quantidade;
	}

	@Override
	public String toString() {
		return getProduto().getNome()
				+ ", $"
				+ String.format("%.2f", preço)
				+ ", Quantity: "
				+ quantidade
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
	

}