package entities;

public class Produto {
	
	String nome;
	Double preço;
	
	public Produto(String nome, Double preço) {
		this.nome = nome;
		this.preço = preço;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreço() {
		return preço;
	}
	public void setPreço(Double preço) {
		this.preço = preço;
	}


}
