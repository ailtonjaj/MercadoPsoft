
public class Produto {
	
	private String nome;
	private String fornecedor;
	private double preço;
	
	public Produto(String nome, String fornecedor, double preço) {
		this.nome = nome;
		this.fornecedor = fornecedor;
		this.preço = preço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	
}
