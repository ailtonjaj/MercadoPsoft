
public class Services {
	
	public void criaProduto(String nome, String fornecedor, double preço) {
		Produto prod = new Produto(nome, fornecedor, preço);
		Repositorio repo = new Repositorio();
		repo.inserir(nome, prod);
	}
}
