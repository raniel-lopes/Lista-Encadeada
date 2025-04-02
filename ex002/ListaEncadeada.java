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
	
	//Precisa criar Pesquisar, Listar e colocar em ordem alfabetica
	
	public Aluno pesquisar(String nome) {
		Celula atual = primeiro;
		while(atual != null) {
			if(atual.getValor().getNome().equalsIgnoreCase(nome)) {
				return atual.getValor();
			}
			atual = atual.getProximo();
		}
		return null; //Retorna null caso não encontre o aluno pesquisado
	}
	
	public void listar() {
		Celula atual = primeiro;
		while(atual != null) {
			System.out.println(atual.getValor().getNome());
			atual = atual.getProximo();
		}
	}
	
	public void ordenar() {
		if(primeiro == null || primeiro.getProximo() == null) {
			return; // Se a lista estiver vazia ou com um elemento, automaticamente está ordenada
		}
		
		boolean trocou; // Controla se houve trocas nas casinhas
		do {
			trocou = false; // Assumimos primeiro que não houve troca
			Celula atual = primeiro;
			Celula anterior = null;
			
			while(atual.getProximo() != null) { //Percorre a lista até o penúltimo elemento
				Celula proximo = atual.getProximo();
				
				// Comparando os nomes
				if(atual.getValor().getNome().compareToIgnoreCase(proximo.getValor().getNome()) > 0) {
					// Se o nome do aluno atual for maior que o próximo, troca a posição
					
					if(anterior == null) {
						// Se estivermos no primeiro elemento da lista
						primeiro = proximo;
					} else {
						// Se não, ajusta o ponteiro do elemento anterior]
						anterior.setProximo(proximo);
					}
					
				}
			}
		}
	}
}
