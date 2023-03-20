
public class Facade {
	
	Services services = new Services();
	
	public void criaProd(String nome, String fornecedor, double preço) {
		return services.criaProduto(nome, fornecedor, preço);
	}
}
