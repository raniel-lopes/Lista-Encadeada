package ex005;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;
	private int tamanho = 0;
	private static final int LIMITE = 7;

	public void adicionarNoInicio(int valor) {
		if (tamanho >= LIMITE) {
			System.out.println("Lista cheia! Não é possível adicionar no início");
			return;
		}

		Celula celula = new Celula();
		celula.setValor(valor);

		if (primeiro == null) {
			primeiro = ultimo = celula;
		} else {
			celula.setProximo(celula);
			primeiro = celula;
		}
		
		tamanho++;
		System.out.println("Númer adicionado no início.");
	}
	
	public void adicionarNoFim(int valor) {
		if (tamanho >= LIMITE) {
			System.out.println("Lista cheia! Não é possível adicionar no fim.");
			return;
		}
		
		Celula celula = new Celula();
		celula.setValor(valor);
		
		if (primeiro == null) {
			primeiro = ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}
		
		tamanho++;
		System.out.println("Número adiiconado no fim.");
	}
	
	 public boolean temProximo() {
	        if (primeiro == null) {
	            return false;
	        } else if (posicaoAtual == null) {
	            posicaoAtual = primeiro;
	            return true;
	        } else {
	            boolean temProximo = posicaoAtual.getProximo() != null;
	            posicaoAtual = posicaoAtual.getProximo();
	            return temProximo;
	        }
	    }

	    public Celula getPosicaoAtual() {
	        return posicaoAtual;
	    }

	    public void resetarIteracao() {
	        posicaoAtual = null;
	    }

}
