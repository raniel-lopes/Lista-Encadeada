package ex001;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;

	// Método para adicionar
	public void adicionar(Professor valor) {
		// Cria a casinha(celula)
		Celula celula = new Celula();

		// Coloca o valor dentro da casinha
		celula.setValor(valor);

		// Condição para saber como está a lista
		if (primeiro == null && ultimo == null) {
			// Entro apenas se a lista estiver vazia
			primeiro = celula;
			ultimo = celula;
		} else {
			// Entro quando a lista já conter um dado
			ultimo.setProximo(celula);
			ultimo = celula;
		}
	}

	// Metodo para se movimentar na sequencia das casinhas
	public boolean temProximo() {
		if (primeiro == null) {
			return false;
		} else if (posicaoAtual == null) {
			posicaoAtual = primeiro;
			return true;
		} else {
			boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
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

	// Método para remover o item da lista
	public boolean remover(int id) {
		if (primeiro == null) {
			return false; // Lista vazia, nada para remover
		}

		// Se o primeiro professor for o que queremos remover
		if (primeiro.getValor().getId() == id) {
			primeiro = primeiro.getProximo(); // Atualiza o ponteiro 'primeiro'

			// Se a lista ficar vazia após a remoção
			if (primeiro == null) {
				ultimo = null;
			}
			return true;
		}

		// Percorre a lista para encontrar e remover o professor
		Celula atual = primeiro;
		while (atual.getProximo() != null) {
			if (atual.getProximo().getValor().getId() == id) {
				atual.setProximo(atual.getProximo().getProximo()); // Remove a célula
				return true;
			}
			atual = atual.getProximo();
		}

		return false; // Professor com o ID não foi encontrado
	}

	public int verificarTamanho() {
		int tamanho = 0;
		Celula atual = primeiro;

		while (atual != null) {
			tamanho++;
			atual = atual.getProximo();
		}

		return tamanho;
	}

	public boolean verificarVazia() {
		return primeiro == null;
	}

	public void apagarLista() {
		primeiro = null;
		ultimo = null;
		posicaoAtual = null;
	}

}
