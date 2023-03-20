import java.util.HashMap;
import java.util.Map;

public class Repositorio {
	private Map<String, Produto> produtos = new HashMap<String, Produto>();
	
	public inserir(String id, Produto prod) {
		produtos.put(id, prod);
	}
}
