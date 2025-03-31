package ex002;

public class ListaEncadeada {
	
	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;
	
	public void adicionar(Aluno valor) {
		// Cria a casinha (celula)
		Celula celula = new Celula();
		
		celula.setValor(valor);
		
		// Verifica como está a lista
		if (primeiro == null && ultimo == null) {
			// Se a lista estiver vazia, entro
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}	
	}
	
	// Método para verificar se há próximo elemento / se movimentar pelas casinhas
	public boolean temProximo() {
		if (posicaoAtual == null) {
			if (primeiro != null) {
				posicaoAtual = primeiro;
				return true;
			}
			return false;
		} else {
			boolean temProximo = posicaoAtual.getProximo() != null;
			if (temProximo) {
				posicaoAtual = posicaoAtual.getProximo();
			}
			return temProximo;
		}
	}

	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}
	
	private Celula recuperarPenultimo(Celula celula) {
		if (celula.getProximo() == ultimo) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());
	}
	
	// Método para remover o último elemento
	public void remover() {
		if(primeiro == null) {
			return; //Retorno a lista vazia
		}
		
		if (primeiro.getProximo() == null) {
			//Lista com apenas um elemento
			primeiro = ultimo = null;
		} else {
			Celula penultimo = recuperarPenultimo(primeiro);
			ultimo = penultimo;
			penultimo.setProximo(null);
		}
	}
}
