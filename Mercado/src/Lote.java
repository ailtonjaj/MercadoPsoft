import java.sql.Date;

public class Lote {
	
	Produto prod;
	Date validade;
	int quantidade;
	
	public Lote(Produto prod, Date validade, int quantidade) {
		this.prod = prod;
		this.validade = validade;
		this.quantidade = quantidade;
	}

	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
