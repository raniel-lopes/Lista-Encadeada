package ex003;

public class Celula {
	private int valor;
	private Celula proximo;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

	public Celula(int valor) {
		this.valor = valor;
	}

	public Celula() {
		// TODO Auto-generated constructor stub
	}
}
