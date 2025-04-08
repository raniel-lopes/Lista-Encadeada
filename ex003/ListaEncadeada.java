package ex003;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;

	// Método para adicionar
	public void adicionar(int valor) {
		// Cria a casinha(celula)
		Celula celula = new Celula();
		celula.setValor(valor); // Coloca o valor dentro da casinha

		if (primeiro == null && ultimo == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}
	}

	public void buscarPosicoes(int numero) {
		Celula atual = primeiro;
		int posicao = 0;
		boolean encontrado = false;

		while (atual != null) {
			if (atual.getValor() == numero) {
				System.out.println("Número " + numero + " encontrado na posição: " + posicao);
				encontrado = true;
			}
			atual = atual.getProximo();
			posicao++;
		}
		
		if (!encontrado) {
			System.out.println("Número " + numero + " não foi encontrado na lista.");
		}
	}

}
