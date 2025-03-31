package ex001;

public class TestaListaEncadeada {
	public static void main(String[] args) {
		ListaEncadeada listaEncadeada = new ListaEncadeada();

		addProfessor(listaEncadeada);
		System.out.println("Todos os professores foram adicionados");

		// Lista os professores adicionados
		System.out.println("\nLista de Professores:");
		listaEncadeada.resetarIteracao();
		imprimirLista(listaEncadeada);

		// Verifica o tamanho da lista
		System.out.println("\nTamanho da lista: " + listaEncadeada.verificarTamanho());
	
		// Removendo um professor
        System.out.println("Removendo contato com ID 3 (ISABEL)");
		boolean removido = listaEncadeada.remover(3);
        System.out.println("Contato removido? " + removido);
	}

	public static void addProfessor(ListaEncadeada listaEncadeada) {
		Professor professor1 = new Professor(1, "Marcos Antônio");
		Professor professor2 = new Professor(2, "Angela");
		Professor professor3 = new Professor(3, "Glaucia");

		listaEncadeada.adicionar(professor1);
		listaEncadeada.adicionar(professor2);
		listaEncadeada.adicionar(professor3);
	}

	public static void imprimirLista(ListaEncadeada lista) {
		while (lista.temProximo()) {
			System.out.println(lista.getPosicaoAtual().getValor().getNome());
		}
	}
}
